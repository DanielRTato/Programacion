package orientacionobjetos;

public class Main {
    public static void main(String[] args) {

        // instanciar un objeto de la clase Coche
        Coche coche1 = new Coche("Toyota", "Corolla", 2021,1,1);
        coche1.arrancar();
        coche1.setAnio(2020);
        System.out.println(coche1);

        Coche coche2 = new Coche("Nissan", "Sentra"); // si no le paso los parámetros, se toman los valores por defecto
        coche2.arrancar();
        coche2.repostar(10);
        coche2.arrancar();
        coche2.viajar(100);
        System.out.println(coche2);
    }
}