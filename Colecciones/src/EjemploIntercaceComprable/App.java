package EjemploIntercaceComprable;

import EjemploIterable.Alumno;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class App {
    public static void main(String[] args) {

        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Juan","22222B", 16));
        alumnos.add(new Alumno("Ana","33333C", 17));
        alumnos.add(new Alumno("Luis","44444D", 18));
        alumnos.add(new Alumno("María","55555E", 19));
        alumnos.add(new Alumno("Carlos","66666F", 20));
        alumnos.add(new Alumno("Elena","77777G", 21));
        alumnos.add(new Alumno("WE",null, 21));
        alumnos.add(new Alumno("AS",null,1));

        Collections.sort(alumnos);




    }
}
