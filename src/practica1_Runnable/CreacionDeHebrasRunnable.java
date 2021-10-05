package practica1_Runnable;

public class CreacionDeHebrasRunnable {

    public static void main(String[] args){
        Thread hebra0 = new Thread(new Hebra(0));
        Thread hebra1 = new Thread(new Hebra(1));

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
class Hebra implements Runnable{
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

