package mx.utng.s30;

import java.util.concurrent.TimeUnit;

public class MiRunnable implements Runnable{
    private String parametro;
    private String nombre;


    public MiRunnable(String nombre){
        this.nombre = nombre;
    }


    public void setParametro(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void run() {
        while (!"terminar".equals(parametro)) {
            mostrarInformacion();
            pausarUnSegundo();
        }
        mostrarInformacion();
    }


    public static void pausarUnSegundo() {
        try {
            TimeUnit.SECONDS.sleep(1);

        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void mostrarInformacion(){
        System.err.println("Hola: "+ nombre + "\t| Parametro");
    }
    
}
