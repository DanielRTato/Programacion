package EjemplosComparator;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {

        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Juan", "22222B", 16));
        alumnos.add(new Alumno("Ana", "33333C", 17));
        alumnos.add(new Alumno("Luis", "44444D", 18));
        alumnos.add(new Alumno("María", "55555E", 19));
        alumnos.add(new Alumno("Carlos", "66666F", 20));
        alumnos.add(new Alumno("Elena", "77777G", 21));


        Collections.sort(alumnos, new AlumnoPorEdadComparator());
        System.out.println("Alumnnos ordenador por edad");
        System.out.println(alumnos);


        Collections.sort(alumnos, new AlumnoPorNiaComparator());
        System.out.println("Alumnos ordenador por Nia");
        System.out.println(alumnos);



    }
}
