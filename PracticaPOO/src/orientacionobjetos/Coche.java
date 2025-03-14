package orientacionobjetos;

public class Coche {
    // atributos o propiedades
    private String marca;
    private String modelo;
    private int anio;

    // constructor
    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void arrancar() {
        System.out.println("El coche %s %s %d ha arrancado".formatted(marca, modelo, anio));
    }
}