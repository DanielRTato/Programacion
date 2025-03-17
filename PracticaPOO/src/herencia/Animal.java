package herencia;

public class Animal { // si fuera final no se podrian crear clases hijas

    // Atributos
    private int estatura;   // si fuera protected, las clases hijas podrian acceder a el
    private double peso;
    private String raza;

    // Constructor
    public Animal(int estatura, double peso, String raza) {
        setEstatura(estatura);
        setPeso(peso);
        this.raza = raza;
    }

    public Animal(){}

    // Getters and Setters
    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
      if (estatura > 0)   this.estatura = estatura;
      else throw new IllegalArgumentException("La estatura no puede ser negativa");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
      if (peso > 0) this.peso = peso;
      else peso = 0;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Animal{" +
                "estatura=" + estatura +
                ", peso=" + peso +
                ", raza='" + raza + '\'' +
                '}';
    }
}
