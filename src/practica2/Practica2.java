package practica2;

public class Practica2 {
    public static void main (String args[] ) {
        if ( args.length != 1 ) {
            System.out.println ("Error");
            System.exit(-1);
        }

        int numHebras = Integer.parseInt (args [0] );

        Hebra[] vectorHebras = new Hebra[ numHebras ];
        CuentaIncrementos contador = new CuentaIncrementos();

        System.out.println ( "Soy el programa principal y contador vale: " + contador.dameContador());

        for ( int hebra = 0; hebra < numHebras; hebra++ ) {
            vectorHebras[hebra] = new Hebra(hebra, contador);
        }

        for ( int hebra = 0; hebra < numHebras; hebra++ ) {
            vectorHebras[hebra].start();

        }

        for (int hebra = 0; hebra < numHebras; hebra++ ) {
            try{
                vectorHebras[hebra].join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();

            }
        }

        System.out.println ("Soy el programa principal y contador vale: " + contador.dameContador());
    }
}
class Hebra extends Thread{
    int idHebra;
    CuentaIncrementos contador;
    public Hebra(int idHebra, CuentaIncrementos contador){
        this.idHebra = idHebra;
        this.contador = contador;
    }
    public void run(){
        System.out.println("Inicia la hebra: "+idHebra);
        for (int i = 0; i < 1000000; i++){
            contador.incrementaContador();
        }
        System.out.println("La hebra "+idHebra+" ha finalizado el incremento");
    }
}

class CuentaIncrementos{

    long contador = 0;

    void incrementaContador(){
        contador++;
    }

    long dameContador(){
        return this.contador;
    }

}
