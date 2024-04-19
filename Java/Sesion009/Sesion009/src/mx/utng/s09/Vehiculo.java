package mx.utng.s09;

public class Vehiculo{
    private Combustible combustible = new Combustible();
    private Llantas[] llantas = new Llanta[4];
    private String marca;
    private String modelo;
    private int anioFabricacion;

    
public Vehiculo(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }
public void setCombustible(Combustible combustible) {
    this.combustible = combustible;
}
public Combustible getCombustible() {
    return combustible;
}

public void setLlantas(Llantas[] llantas) {
    this.llantas = llantas;
}
public Llantas[] getLlantas() {
    return llantas;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public String getMarca() {
    return marca;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public String getModelo() {
    return modelo;
}

public void setAnioFabricacion(int anioFabricacion) {
    this.anioFabricacion = anioFabricacion;
}

public int getAnioFabricacion() {
    return anioFabricacion;
}
    
        
    
}