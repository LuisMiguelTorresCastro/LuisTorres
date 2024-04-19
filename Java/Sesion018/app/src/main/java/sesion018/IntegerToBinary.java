package sesion018;

import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el numero que deseas en binario: ");
        int miNumero = s.nextInt();
        s.close();
        String binario = Integer.toBinaryString(miNumero);
        System.out.printf("El numero %d es en binario %s%n", miNumero, binario);
    }
}
