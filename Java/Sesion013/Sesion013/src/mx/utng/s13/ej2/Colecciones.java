package mx.utng.s13.ej2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Colecciones {
    public static void main(String[] args) {
        List<String> listaCadenas = new ArrayList<>();

        listaCadenas.add("uno");
        listaCadenas.add("dos");
        listaCadenas.add("tres");
        listaCadenas.add("cuatro");
        listaCadenas.add("cinco");

        System.out.println(listaCadenas);
        for (int i = 0; i < listaCadenas.size(); i++){
            System.out.printf("%s%n", listaCadenas.get(i));
        }
        System.out.println("======foreach======");
        for (String cadena : listaCadenas){
            System.out.println(cadena);
        }

        System.out.println(listaCadenas.isEmpty());

        Set<String> SetCadenas = new HashSet<>();

        SetCadenas.add("uno");
        SetCadenas.add("dos");
        SetCadenas.add("tres");
        SetCadenas.add("cuatro");
        SetCadenas.add("cinco");

        //Foreach imprimir los valores
        System.out.println("======Set de cadenas======");
        for (String cadena : SetCadenas) {
            System.out.println(cadena);
        }
        Set<Numero> SetNumeros = new HashSet<>();
        SetNumeros.add(new Numero("Uno"));
        SetNumeros.add(new Numero("Dos"));
        SetNumeros.add(new Numero("Tres"));
        SetNumeros.add(new Numero("Cuatro"));
        SetNumeros.add(new Numero("Cinco"));
        setNumeros.add()
        System.out.println("=======Lista de numeros=======");
        for (Numero numero : SetNumeros) {
            System.out.println(numero.getNombre());
        }
    }
}