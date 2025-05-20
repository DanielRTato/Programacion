package colecciones;

import java.util.*;

// Los set no tienen elementos duplicados y pueden almacenar cualquier tipo de objeto.
public class EjemploSet {
    public static void main(String[] args) {

        Set <String> set = Set.of("Uno", "Dos", "Tres", "Cuatro");

        for (String elemento : set) {
            System.out.println(elemento);
        }

        // HashSet es una implementación de Set que utiliza un mapa de objetos para almacenar los elementos.
        // No está ordenada
        Set<Alumno> set2 = new HashSet<>();
        set2.add(new Alumno("123456", "María" , "Perez García"));
        set2.add(new Alumno("234567", "Juan" , "Ropa Muñoz"));
        set2.add(new Alumno("345678", "Jualia" , "Martínez Luján"));
        set2.add(new Alumno("345678", "Jualia" , "Martínez Luján")); //Repetido así que no lo inserte

        for (Alumno a : set2) {
            System.out.println(a);
        }

        System.out.println("---------------------------------------");
        // LinkedHashSet es una implementación de Set que mantiene el orden de inserción de los elementos.
        Set<Alumno> set3 = new LinkedHashSet<>(set2);
        set3.add(new Alumno("987654", "Pedro" , "García Rodríguez"));
        for (Alumno a : set3) {
            System.out.println(a);
        }

        // TreeSet es una implementación de Set que utiliza un árbol binario para almacenar los elementos.
        // Los elementos se ordenan según un criterio definido por el usuario.
       TreeSet<Integer> set4 = new TreeSet<>();
        Random r = new Random(); // Generador de números aleatorios
        for (int i = 0; i < 10; i++) {
            set4.add(r.nextInt(100));
        }
        for (Integer num : set4) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i : set4.descendingSet()) {
            System.out.print(i + " ");
        }

        Set<Integer> subSet4 = set4.subSet(25, 75);
        System.out.println();
        for (int i : subSet4) {
            System.out.print(i + " ");
        }


    }
}
