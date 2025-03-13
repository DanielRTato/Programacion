 public class Circulo extends Punto {

    private double radio;

    public Circulo (double x, double y, double r){
        super (x, y);
        radio = r;
    }

    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio) {
        if (radio >= 0) this.radio = radio;
        else throw new RuntimeException("El radio debe ser positivo");
    }

    public double calcularArea(){
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro(){
        return 2 * radio * Math.PI;
    }

    public String toString(){
        return "Circulo con centro en (" + getX() + ", " + getY() + "), radio " + radio + ", área " + calcularArea() + ", perímetro " + calcularPerimetro();

    }

}
