package abstractas;

public abstract class VehiculoAereo  extends Vehiculo{

    private int altitudMaxima;

    public VehiculoAereo(String marca,  int altitudMaxima) {
        super(marca);
        this.altitudMaxima = altitudMaxima;
    }

    @Override
    public void conducir(){
        System.out.println("Volando el vehiculo aereo");
    }

    public abstract void despegar();
    public abstract void aterrizar();



}
