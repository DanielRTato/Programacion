package herencia;

public class App {
    public static void main(String[] args) {

        Perro perro = new Perro(50, 20.5, "Pastor Aleman");
        Gato gato = new Gato(30, 5.5, "Siames");

        perro.presentar();
        perro.ladrar();
        System.out.println(perro);
       // gato.presentar();
        gato.maullar();
        System.out.println(gato);


    }
}
