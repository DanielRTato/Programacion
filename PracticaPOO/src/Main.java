import orientacionobjetos.Coche;

public class Main {
    public static void main(String[] args) {
        // instanciar un objeto de la clase Coche
        Coche coche1 = new Coche("Toyota", "Corolla", 2021);
        coche1.arrancar();

        Coche coche2 = new Coche("Nissan", "Sentra", 2020);
        coche2.arrancar();
    }
}