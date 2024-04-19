package mx.utng.s14.Reto13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListaFrutas {
    public static void main(String[] args) {
        List<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Plátanos");
        listaFrutas.add("Sandía");
        listaFrutas.add("Pera");
        listaFrutas.add("Manzana");
        listaFrutas.add("Naranja");
        listaFrutas.add("Kiwi");

        // Buscar el elemento más pequeño (alfabéticamente)
        String min = Collections.min(listaFrutas);
        System.out.println("Elemento mas pequeño alfabéticamente es: " + min);

        // Buscar el elemento más grande (alfabéticamente)
        String max = Collections.max(listaFrutas);
        System.out.println("Elemento mas grande alfabéticamente es: " + max);

        // Ordenar la lista alfabéticamente
        Collections.sort(listaFrutas);
        System.out.println("Lista de frutas en orden: " + listaFrutas);

        // Buscar la posición de "Pera" y "Naranja" en la lista ordenada
        int posicionPera = listaFrutas.indexOf("Pera");
        int posicionNaranja = listaFrutas.indexOf("Naranja");
        System.out.println("Posición de Pera: " + posicionPera);
        System.out.println("Posición de Naranja: " + posicionNaranja);

        // Agregar tres Manzanas nuevas a la lista
        listaFrutas.add("Manzana");
        listaFrutas.add("Manzana");
        listaFrutas.add("Manzana");

        // Desordenar los elementos de la lista
        Collections.shuffle(listaFrutas);
        System.out.println("Lista de frutas en desorden: " + listaFrutas);

        // Contar cuántas Manzanas hay en la lista
        long cantidadManzanas = listaFrutas.stream().filter(fruta -> fruta.equals("Manzana")).count();
        System.out.println("Cantidad de Manzanas: " + cantidadManzanas);
    }
}