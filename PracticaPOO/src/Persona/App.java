package Persona;

public class App {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 20, "12345678Z");
        System.out.println(p1);
        p1.setEdad(30);
        System.out.println(p1);
        p1.setDni("12345678Z");
        System.out.println(p1);
    }
}
