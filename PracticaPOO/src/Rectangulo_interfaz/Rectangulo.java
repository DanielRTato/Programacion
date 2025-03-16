package Rectangulo_interfaz;

public class Rectangulo implements Dibujable {

    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }


    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectangulo de : " + largo + " x " + ancho);
    }
}
