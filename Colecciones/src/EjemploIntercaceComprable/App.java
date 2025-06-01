package EjemploIntercaceComprable;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {

        ArrayList<Alumno> alumnoss = new ArrayList<>();

        alumnoss.add(new Alumno("Juan", "22222B", 16));
        alumnoss.add(new Alumno("Ana", "33333C", 17));
        alumnoss.add(new Alumno("Luis", "44444D", 18));
        alumnoss.add(new Alumno("María", "55555E", 19));
        alumnoss.add(new Alumno("Carlos", "66666F", 20));
        alumnoss.add(new Alumno("Elena", "77777G", 21));


        Collections.sort(alumnoss); /// Ordena en base al metodo compareTo de la clase Alumno
        System.out.println(alumnoss); // Entonces los muestra ordenados por edad

        alumnoss.add(new Alumno("Alex", "888888Z",18));

        Collections.sort(alumnoss); /// Ordena en base al metodo compareTo de la clase Alumno
        System.out.println(alumnoss);

        Collections.sort(alumnoss);


    }
}
