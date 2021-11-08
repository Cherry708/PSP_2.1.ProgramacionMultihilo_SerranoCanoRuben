package ejemplo3;

public class CreandoHebrasRunnable {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Tarea1());
        Thread t2 = new Thread(new Tarea2());

        //Tarea2 t2 = new Tarea2(); No funciona porque Tarea1 y 2 implementan pero NO son threads
        t1.start(); //ojo no pongo t1.run
        t2.start();

    }

}

class Tarea1 implements Runnable{
    public void run(){
        for (int i = 0 ; i < 10; i++){
            System.out.println("Tarea 1");
        }
    }
}

class Tarea2 implements Runnable {
    public void run(){
        for (int i = 0 ; i < 10; i++){
            System.out.println("Tarea 2");
        }
    }
}
