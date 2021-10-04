package actividad2;

public class Actividad2 {

    public static void main(String[] args){
        Tarea tarea = new Tarea(0,1);

        tarea.start();

        try {
            tarea.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class Tarea extends Thread{

    int idThread0;
    int idThread1;

    Tarea(int idThread0, int idThread1){
        this.idThread0 = idThread0;
        this.idThread1 = idThread1;
    }

    public void run(){
        if (this.idThread0 == 0){
            for (int i = 0 ; i < 3; i++){
                System.out.println("Hola");
            }
        }
        if (this.idThread1 == 1){
            for (int i = 0 ; i < 3; i++){
                System.out.println("Adios");
            }
        }
    }

}