package herencia;

public class Gato extends Animal{ // si fuera final no se podrian crear clases hijas

    public Gato (int estatura, double peso, String raza){
        super(estatura, peso, raza);
    }

    public void maullar(){
        System.out.println("Miau miau");
    }
}
