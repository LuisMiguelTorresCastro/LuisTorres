package mx.utng.s13.ej1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Polimorfosmo {
    public static void main(String[] args) {
        Profesor profe1 = new Profesor("Laura", "Mireles Hernandez", "UTNG00541");
        profe1.mostrarDatos();
        Profesor profe2 = new ProfesorInterino("Andes", "Landeros Ortiz", "UTNG00242", LocalDate.of(2024, Month.DECEMBER, 21))
        profe2.mostrarDatos();

        Persona p = new Persona("Cludia", "Solis");
        p = new Profesor(p.getNombre(), p.getApellido(), "UTNG0001");
        p.mostrarDatos();
    }
}
