public abstract class Inmueble {

    private String calle;
    private int numero;
    private String localidad;
    private double precio;
    private boolean venta;

    public Inmueble(String calle, int numero, String localidad, double precio, boolean venta){
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        setPrecio(precio);
        this.venta = venta;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = Math.abs(numero);
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = Math.abs(precio);
    }

    public boolean isVenta() {
        return venta;
    }

    public void setVenta(boolean venta) {
        this.venta = venta;
    }

    public String toString(){
        String estado;
        if (venta) estado = "venta";
        else estado = "alquiler";
        return "El inmueble de la localidad: ; "+ getLocalidad() + "con calle : " + getCalle() + getNumero() + "tiene un precio de " + getPrecio() + " en estado : " + estado;
    }

    public  abstract double calcularGanancia ();




}

