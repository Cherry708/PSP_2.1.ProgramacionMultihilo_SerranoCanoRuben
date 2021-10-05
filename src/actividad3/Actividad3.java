package actividad3;

public class Actividad3 {
    public static void main(String[] args){
        int numHebras = 5;

        Hebra[] vectorHebras = new Hebra[10];

        for (int i = 0; i < numHebras; i++){
            vectorHebras[i] = new Hebra(i);
        }

        for (int i = 0; i < numHebras; i++){
            vectorHebras[i].start();
        }

        for (int i = 0; i < numHebras; i++){
            try {
                vectorHebras[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Todas las hebras han acabado");
    }
}

class Hebra extends Thread{
    int idHebra;
    public Hebra(int idHebra){
        this.idHebra = idHebra;
    }
    public void run(){
        System.out.println("Hola, soy la hebra: "+idHebra);
    }
}
