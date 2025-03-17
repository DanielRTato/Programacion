package herencia;

public non-sealed class Bulldog extends Perro {

    private String color;
    private String nombre;

    public Bulldog(int estatura, double peso, String raza, String color) {
        super(estatura, peso, raza);
        this.color = color;
    }

    public void setPeso(int peso){
        if (peso > 0){
            super.setPeso(peso);
        }
    }

}
