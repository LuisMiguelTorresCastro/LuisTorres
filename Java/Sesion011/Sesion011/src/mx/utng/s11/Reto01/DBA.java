package mx.utng.s11.Reto01;

import java.time.LocalDate;

    public class DBA extends Empleado{
    private String herramientaConsultas;

    public DBA(String nombre, byte edad, LocalDate fechaNacimiento, float salario, String herramientaConsultas) {
        super(nombre, edad, fechaNacimiento, salario);
        this.herramientaConsultas = herramientaConsultas;
    }

    public String getHerramientasConsultas() {
        return herramientaConsultas;
    }

    public void setHerramientasConsultas(String herramientasConsultas) {
        this.herramientaConsultas = herramientasConsultas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Herramientas de Consultas: " + getHerramientasConsultas();
    }
    
}
