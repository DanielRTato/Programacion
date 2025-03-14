package orientacionobjetos;

public class Coche {  //el nombre de las clases va en mayúscula

    // atributos o propiedades
    private String marca;
    private String modelo;
    private int anio;
    private double velocidadActual;
    private double litrosEnDeposito;

    // constructor puede ser vacío o con parámetros (atributos), puedes tener ceros o más constructores
    // tanto el constructor como los getters y setters se pueden generar automáticamente en IntelliJ
    public Coche(String marca, String modelo, int anio,double velocidadActual, double litrosEnDeposito) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadActual = velocidadActual;
        this.litrosEnDeposito = litrosEnDeposito;
    }

    /*public Coche (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = 2020;
    }*/

    // constructor con this para reutilizar código
    public Coche (String marca, String modelo){
        this(marca, modelo, 2020,0,0);
    }

    // metodo o comportamiento
    public void arrancar() {
        System.out.println("El coche %s %s %d ha arrancado".formatted(marca, modelo, anio));
    }
}