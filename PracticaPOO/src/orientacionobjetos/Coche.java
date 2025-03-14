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
    public Coche(String marca, String modelo, int anio, double velocidadActual, double litrosEnDeposito) {
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
    public Coche(String marca, String modelo) {
        this(marca, modelo, 2020, 0, 0);
    }

    // metodo o comportamiento
    public void arrancar() {
        if (this.litrosEnDeposito > 0) { // este this no es necesario, pero lo pongo para que se vea que es un atributo de la clase
            System.out.println("El coche %s %s %d ha arrancado".formatted(marca, modelo, anio));
        } else {
            System.out.println("No se puede arrancar, el depósito está vacío");
        }
    }

    public double repostar(double litros) {
        this.litrosEnDeposito += litros;
        return this.litrosEnDeposito;
    }

    public double acelerar (double velocidad){
        velocidadActual += velocidad;
        return velocidadActual;
    }

    public double viajar (double kilometros){
        if (kilometros * 0.07 <= litrosEnDeposito){ // 7 litros por cada 100 km
            double tiempoEnHoras = kilometros / velocidadActual;
            double tiempoEnSegundos = tiempoEnHoras * 3600; // 1 hora = 3600 segundos o podria hacer tiempoEnHoras * 60 * 60
            this.litrosEnDeposito -= kilometros * 0.07; //
            System.out.println("Tras el viaje el coche ha quedado con %.2f litros en el depósito".formatted(litrosEnDeposito));
            return tiempoEnSegundos;
        } else {
            System.out.println("No hay suficiente combustible para viajar esa distancia");
            return litrosEnDeposito;
        }

    }

    //setters y getters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }
    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public double getLitrosEnDeposito() {
        return litrosEnDeposito;
    }
    public void setLitrosEnDeposito(double litrosEnDeposito) {
        this.litrosEnDeposito = litrosEnDeposito;
    }
}
