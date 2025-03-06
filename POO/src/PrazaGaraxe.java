public class PrazaGaraxe extends Inmueble{
    private double ancho;
    private double longo;
    private int plaza;

    public PrazaGaraxe(String calle, int numero, String localidad, double precio, boolean venta, double ancho, double longo, int plaza){
        super(calle, numero, localidad, precio, venta);
        setAncho(ancho);
        setLongo(longo);
        setNumPlaza(plaza);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = Math.abs(ancho) ;
    }

    public double getLongo() {
        return longo;
    }

    public void setLongo(double longo) {
        this.longo = Math.abs(longo) ;
    }

    public int getPlaza() {
        return plaza;
    }

    public void setNumPlaza(int plaza) {
        this.plaza =  Math.abs(plaza);
    }

    @Override
    public double calcularGanancia() {
        if (isVenta() ) return getPrecio() * 0.02;
        else return getPrecio();
    }
}
