package abstractas;

public abstract class VehiculoAereo extends Vehiculo{

    private int altitudMaxima;

    public VehiculoAereo(String marca, String modelo, int altitudMaxima) {
        super(marca, modelo);
        this.altitudMaxima = altitudMaxima;
    }

    @Override
    public void conducir(){
        System.out.println("Volando el vehiculo aereo");
    }

    public abstract void despegar();
    public abstract void aterrizar();


}
