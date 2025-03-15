package herencia;

// Clase hija de Animal
public class Perro extends Animal{

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
