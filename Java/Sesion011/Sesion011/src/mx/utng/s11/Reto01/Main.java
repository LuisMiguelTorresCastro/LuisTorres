package mx.utng.s11.Reto01;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Programador programador = new Programador("Jesus", (byte) 24, LocalDate.of(2000, 5, 29), 500, "Phyton");
        System.out.println(programador.toString());
    }
}
