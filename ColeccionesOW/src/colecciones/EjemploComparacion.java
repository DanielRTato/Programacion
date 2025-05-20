package colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class EjemploComparacion {
    public static void main(String[] args) {
        // Comparable interface indica la forma principal de comparar objetos
        // Comparator indica otras forma de comparar objetos

        Alumno a1 = new Alumno(123, "Juan", "Zerez", 8.5, 20);
        Alumno a2 = new Alumno(234, "Maria", "Garcia", 9.0, 21);
        Alumno a3 = new Alumno(345, "Pedro", "Martinez", 8.7, 20);

        if (a1.compareTo(a2) > 0) {
            System.out.println("El alumno %s tiene que ir antes de la lista.".formatted(a2));
        }else {
            System.out.println("El alumno %s tiene que ir antes de la lista.".formatted(a1));
        }

        System.out.println();
        List<Alumno> listaAlumnos = new ArrayList<>(List.of(a1, a2, a3));
        System.out.println("La lista en orden de inserccion");
        System.out.println(listaAlumnos);

        TreeSet<Alumno> treeSetAlumnos = new TreeSet<>(listaAlumnos);
        System.out.println("Lista ordenada por apellidos");
        System.out.println(treeSetAlumnos);

        TreeSet<Alumno> alumnos2 = new TreeSet<>(new ComparatorPorNotaDescendente());
        alumnos2.addAll(listaAlumnos);
        System.out.println("Lista ordenada por nota media (descendente)");
        System.out.println(alumnos2);
    }

}
