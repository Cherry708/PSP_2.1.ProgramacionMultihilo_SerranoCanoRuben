package practica1_Thread;

public class CreacionDeHebrasSubclaseThread {
    public static void main(String[] args){
        Hebra hebra0 = new Hebra(0);
        Hebra hebra1 = new Hebra(1);

        hebra0.start();
        hebra1.start();

        try {
            hebra0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            hebra1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Todas las hebras han acabado.");
    }
}
class Hebra extends Thread{
    int idHebra;
    public Hebra(int idHebra){
        this.idHebra = idHebra;
    }
    public void run(){
        for (int i = 0; i < 1000; i++){
            System.out.println("Soy la hebra: "+idHebra);
        }
    }

}