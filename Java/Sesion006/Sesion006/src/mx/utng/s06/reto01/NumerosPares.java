package mx.utng.s06.reto01;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Utilizando el modulo poner todos los numeros
        System.out.print("Ingrese el primer número del rango:");
        int inicio = scanner.nextInt();
        
        //pares que hay en un rango dado por el usuario
        System.out.print("Ingrese el segundo número del rango:");
        int fin = scanner.nextInt();
        
        //inicio, fin, i
        if (fin <= inicio) {
            System.out.println("Error: El segundo número debe ser mayor que el primero.");
            return;
        }

        //ciclo for o while o do while, if
        System.out.println("Numeros pares en el rango:");
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //Cerrar el scanner para evitar fugas de recursos
        scanner.close();
    }
    
}
