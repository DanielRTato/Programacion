 public class Prisma extends Punto{
    private double altura;
    private double base;

    public Prisma(double x, double y, double altura, double base) throws ExcepcionPuntoForaPrimeiroCadrante {
        super(x, y);
        this.altura = altura;
        this.base = base;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        if (altura>=0) this.altura=altura;
        else throw new RuntimeException("La altura debe ser positiva");
    }

    public double getBase(){
        return base;
    }
    public void setBase(double base){
        if (base>=0) this.base=base;
        else throw new RuntimeException("La base debe ser positiva");
    }
    public double calcularArea(){
        return base* altura;
    }

    public double calcularVolumen(){
        return calcularArea()*altura;
    }

    public String toString(){
        return "El area es : " + calcularArea() + " y el volumen es :" + calcularVolumen();
    }


}
