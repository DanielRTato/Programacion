public class Vivienda  extends Inmueble{

    private int numHabitaciones;
    private String observaciones;
    private PrazaGaraxe garaxe;
    private String piso;

    public Vivienda(String calle, int numero, String localidad, double precio, boolean venta, double ancho, double longo, int plaza, int numHabitaciones, String observaciones,PrazaGaraxe, String piso){
        super(calle, numero, localidad, precio, venta);
        setnumHabitaciones(numHabitaciones);
        this.observaciones = observaciones;
        this.garaxe = garaxe;
        this.observaciones = observaciones;
        this.piso = piso;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public PrazaGaraxe getGaraxe() {
        return garaxe;
    }

    public void setGaraxe(PrazaGaraxe garaxe) {
        this.garaxe = garaxe;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String toString (){
        return "Vivienda{" +
                "numHabitaciones=" + numHabitaciones +
                ", observaciones='" + observaciones + '\'' +
                ", garaxe=" + garaxe +
                ", piso='" + piso + '\'' +
                '}';
    }

    public double calcularGanancia(){
        if (isVenta()) return getPrecio() * 0.02;
        else return getPrecio();
    }


}
