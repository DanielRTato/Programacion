public class PlazaGarageConTrastero extends PrazaGaraxe{

    private double superficie;

    public PlazaGarageConTrastero(String calle, int numero, String localidad, double precio, boolean venta, double ancho, double largo, int plaza) {
        super(calle, numero, localidad, precio, venta, ancho, largo, plaza);
        this.superficie = superficie;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = Math.abs(superficie);
    }
}
