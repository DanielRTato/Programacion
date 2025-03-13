 public class Cilindro extends Circulo{

    private double altura;
    public Cilindro(double x, double y, double r, double altura) {
        super(x, y, r);
        this.altura=altura;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        if (altura>=0) this.altura=altura;
        else throw new RuntimeException("La altura debe ser positiva");
    }

    public double calcularVolumen(){
        return calcularArea()*altura;
    }
    public double calcularSuperficie(){
        return 2*calcularArea()+calcularPerimetro()*altura;
    }

    public String toString(){
        return "Cilindro con centro en (" + getX() + ", " + getY() + "), radio " + getRadio() + ", altura " + altura + ", volumen " + calcularVolumen() + ", superficie " + calcularSuperficie();
    }




}
