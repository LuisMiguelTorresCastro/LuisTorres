package mx.utng.s14;

import java.util.PriorityQueue;
import java.util.Queue;

public class LibroTest {
    public static void main(String[] args) {
        Queue<Libro> libros = new PriorityQueue<>();
        libros.add(new Libro("Libro 1", Math.random()*10));
        System.out.println(libros);
    }
}
