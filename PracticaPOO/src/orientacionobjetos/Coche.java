package orientacionobjetos;

public class Coche {  //el nombre de las clases va en mayúscula

    // atributos o propiedades
    private String marca;
    private String modelo;
    private int anio;

    // constructor puede ser vacío o con parámetros (atributos), puedes tener ceros o más constructores
    // tanto el constructor como los getters y setters se pueden generar automáticamente en IntelliJ
    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    /*public Coche (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = 2020;
    }*/

    // constructor con this para reutilizar código
    public Coche (String marca, String modelo){
        this(marca, modelo, 2020);
    }


    public void arrancar() {
        System.out.println("El coche %s %s %d ha arrancado".formatted(marca, modelo, anio));
    }
}