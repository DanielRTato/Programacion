import Ej1.Deportista;
import Ej1.Persoa;

public class Main {
    public static void main(String[] args) {

        Persoa alguien = new Persoa("Juan", "23525235", "23423424");
        System.out.println(alguien.getDni());
        alguien.setDni("2452525");

        Deportista otro = new Deportista("Baloncesto", "Cerla", "2025bal123456");


    }
}