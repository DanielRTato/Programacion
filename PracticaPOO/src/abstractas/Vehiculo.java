package abstractas;

public abstract class Vehiculo {

    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo)  {
        this.marca = marca;
        this.modelo = modelo;

    }

    public Vehiculo(String marca ) {
        this.marca = marca;

    }

    public void mostrarInfromacion(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    public abstract void conducir();


}
