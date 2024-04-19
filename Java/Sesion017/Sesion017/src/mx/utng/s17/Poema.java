package mx.utng.s17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Poema{
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Jesus\\OneDrive\\Documents\\poema.txt"); 
         //Establecemos la ruta del archivo

    BufferedWriter bw = new BufferedWriter(fw);
         bw.write("El rumbo de tu corazón;\n" + //
                      "Sólo aquello que eres has de ser;\n" + //
                      "Y aquello que no eres, no.\n" + //
                      "Así, en el mundo, tu modo sutil,\n" + //
                      "Tu gracia, tu bellísimo ser,\n" + //
                      "Serán objeto de elogio sin fin;\n" + //
                      "Y el amor... un sencillo deber.");

 bw.newLine();
        bw.write("");
        bw.newLine();
        bw.close();
   
    FileReader fr = new FileReader("C:\\Users\\ruano\\OneDrive\\Documents\\poema.txt");  
        try (//Colocamos la ruta de nuestro archivo
    BufferedReader br = new BufferedReader(fr)) {
    String linea = null;

        while ((linea = br.readLine())!=null) {
            System.out.println(linea);
            }
        }
    }
}