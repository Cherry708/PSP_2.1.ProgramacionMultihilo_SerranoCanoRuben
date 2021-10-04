package actividad1;

public class Actividad1 {
    public static void main(String[] args) {

        actividad1.Tarea1 t1 = new Tarea1();
        actividad1.Tarea2 t2 = new Tarea2();

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Tarea1 extends Thread{
    public void run(){
        for (int i = 0 ; i < 3; i++){
            System.out.println("Hola");
        }
    }
}
class Tarea2 extends Thread{
    public void run(){
        for (int i = 0 ; i < 3; i++){
            System.out.println("Adios");
        }
    }
}



