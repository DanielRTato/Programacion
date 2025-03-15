package Ej1;

public class main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan", "Perez", "sqda@asd",18,986111111);
        System.out.println(alumno1.toString());
        System.out.println(alumno1.esMayorDeEdad());


        Alumno alumno2 = new Alumno("Maria", "Gomez", 12);
        System.out.println(alumno2.toString());
        System.out.println(alumno2.esMayorDeEdad());




    }
}
