package mx.utng.s11;

public class PruebaTriangulo {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(7.0, 6.0, "Color Pastel");
        System.out.println("info del Triangulo");
        triangulo.mostrarDimencion();
        triangulo.mostrarEstilo();
        System.out.println("Su area es: "+triangulo.area());
    }
}
