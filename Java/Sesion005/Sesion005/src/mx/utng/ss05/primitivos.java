package mx.utng.ss05;

public class primitivos {
    public static void main(String[] args) {
        //Entero muy pequeño (-128 a 127)
        byte valorbyte = 10;
        System.out.println(valorbyte);
        
        //Entero corto (-32768 a 32767)
        short valorShort = 32767;
        System.out.println(valorShort);

        //  Entero base (-214783648 a 214783648)
        int valorInt = 2147483647;

        //Entero mas largo rango -9223370236854775808 a 9223370236854775807
        long valorLong = 9223372036854775807L;

        //Numero real tiene punto decimal es de 6 cifras despues del punto
        float valorfloat = 7.5131238434334343f;
        System.out.println(valorfloat);
        //Numero real con doble precision 16 cifras despues del punto
        double valorDouble = 3.1234567890123456789012;
        System.out.println("Double:" + valorDouble);

        //Valor boolean con solo dos valores posibles true/false
        boolean valorBoolean = true;
        //Primitivo para texto
        char valorChar = 'B';

        System.out.printf("Valor boolrano: %b %nValor caracter: %c%h", valorBoolean, valorChar);

        float numFloat = 1.5F;
        int numlntl = (int)numFloat;
        system.out.printf("Flotante: %f, Entero: %d%n",numFLoat, nnumInt);


        char numChar = 'M';
        int numInt2 = numChar;
        system.out.printf("Char: %c, Entero: %d%n",numFLoat, nnumInt2);