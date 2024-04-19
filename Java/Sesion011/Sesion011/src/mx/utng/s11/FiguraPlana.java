package mx.utng.s11;

public class FiguraPlana {
    private final double BASE;
    private final double ALTURA;
    public FiguraPlana(double bASE, double altura) {
        this.BASE = bASE;
        this.ALTURA = altura;
    }

    public double getBASE() {
        return BASE;
    }

    public double getALTURA() {
        return ALTURA;
    }

    public void mostrarDimencion(){
        System.out.printf("La base de la figura es: %.1f y la autura es: %.1f.%n", BASE, ALTURA);
    }
    
}
