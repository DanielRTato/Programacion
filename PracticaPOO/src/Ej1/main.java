package Ej1;

public class main {
    public static void main(String[] args) {
        /*
        Alumno alumno1 = new Alumno("Juan", "Perez", "sqda@asd",18,986111111);
        System.out.println(alumno1.toString());
        System.out.println(alumno1.esMayorDeEdad());


        Alumno alumno2 = new Alumno("Maria", "Gomez", 12);
        System.out.println(alumno2.toString());
        System.out.println(alumno2.esMayorDeEdad());

        Alumno alumno3 = new Alumno();
        alumno3.setNombre("Alex");
        alumno3.setApellido("Gomez");
        alumno3.setEmail("asdasd@asd");
        alumno3.setEdad(20);
        alumno3.setTelefono(986111111);
        System.out.println(alumno3); //toString implicito

        Alumno alumno4 = new Alumno("Juan", "Perez",11);
        alumno4.setTelefono(986111111);
        alumno4.setEmail("asdasd@asd");
        System.out.println(alumno4); //toString implicito
        System.out.println("El alumno %s %s %s es mayor de edad".formatted(alumno4.getNombre(), alumno4.getApellido(), alumno4.esMayorDeEdad() ? "si" : "no"));

        if (alumno1.equals(alumno2)) {
            System.out.println("Los alumnos son iguales");
        }else{
            System.out.println("No son el mismo alumno");
        }
*/
        // Crear un array de 6 alumnos y mostrar el alumno más joven
        var alumnos = new Alumno[5];
        alumnos[0] = new Alumno("P", "Perez", "sqda@asd",18,986111111);
        alumnos[1] = new Alumno("Maria", "Gomez", 12);
        alumnos[2] = new Alumno("Alex", "Gomez", "asdasd@asd",20,986111111);
        alumnos[3] = new Alumno("Juan", "Perez",11);
        alumnos[4] = new Alumno("Dalinar", "Perez",131);

        int alumnoJoven = 0;
        for (int i = 1; i < alumnos.length; i++) {
            if (alumnos[alumnoJoven].getEdad() >  alumnos[i].getEdad()) {
                alumnoJoven = i;
            }
        }
        Alumno joven = alumnos[alumnoJoven];
        System.out.println("El alumno más joven es: %s %s".formatted(joven.getNombre(), joven.getApellido()));

    }
}
