package actividad2;

public class Actividad2 {

    public static void main(String[] args){
        Tarea tarea0 = new Tarea(0);
        Tarea tarea1 = new Tarea(1);


        tarea0.start();
        tarea1.start();

        try {
            tarea0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            tarea1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class Tarea extends Thread{

    //Solo necesito una hebra, el segundo id sobra
    int idThread;
    //int idThread1;

    Tarea(int idThread0){
        this.idThread = idThread0;
    }
    /*
    Si me han pasado el ID 0, se muestra Hola
    si es 1, se muestra Adios
     */
    public void run(){
        if (this.idThread == 0){
            for (int i = 0 ; i < 3; i++){
                System.out.println("Hola, soy la hebra: "+idThread);
            }
        }
        if (this.idThread == 1){
            for (int i = 0 ; i < 3; i++){
                System.out.println("Adios, soy la hebra "+idThread);
            }
        }
    }

}