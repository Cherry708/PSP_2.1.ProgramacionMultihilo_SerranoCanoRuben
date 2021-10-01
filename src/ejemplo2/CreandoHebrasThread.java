package ejemplo2;

public class CreandoHebrasThread {
    public static void main(String[] args) {

        Tarea1 t1 = new Tarea1();
        Tarea2 t2 = new Tarea2();
        //Aunque el inicio se indique de manera secuancial, la ejecucion no lo es
        t1.start(); //ojo no pongo t1.run
        t2.start();
    }
}

class Tarea1 extends Thread{
    public void run(){
        for (int i = 0 ; i < 10; i++){
            System.out.println("Tarea 1");
        }
    }
}

class Tarea2 extends Thread {
    public void run(){
        for (int i = 0 ; i < 10; i++){
            System.out.println("Tarea 2");
        }
    }
}
