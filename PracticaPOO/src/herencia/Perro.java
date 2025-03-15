package herencia;

// Clase hija de Animal
public sealed class Perro extends Animal
        permits PastorAleman, Bulldog, Boxer{ // si fuera final no se podrian crear clases hijas

    public Perro (int estatura, double peso, String raza){
        super(estatura, peso, raza);
    }

    public void ladrar(){
        System.out.println("Guau guau");
    }

    public void presentar() {
        System.out.println("Hola soy un perro de raza " + getRaza() + " y peso " + getPeso() + " kg");
    }
}
