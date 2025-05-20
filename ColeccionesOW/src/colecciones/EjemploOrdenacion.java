package colecciones;

import java.util.*;

public class EjemploOrdenacion {
    public static void main(String[] args) {

        int[] intArray = new int[100];
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            intArray[i] = r.nextInt(1000);
        }
        //Arrays.sort(intArray,0,10);
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        Integer[] intArray2 = new Integer[100];
        for (int i = 0; i < 100; i++) {
            intArray2[i] = Integer.valueOf(intArray[i]);
        }
        Arrays.sort(intArray2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(intArray2));
        System.out.println();

        Alumno a1 = new Alumno(123, "Juan", "Zerez", 8.5, 20);
        Alumno a2 = new Alumno(234, "Maria", "Garcia", 9.0, 21);
        Alumno a3 = new Alumno(345, "Pedro", "Martinez", 8.7, 20);

        List<Alumno> lista = new ArrayList<>(List.of(a1, a2, a3));
        Collections.sort(lista);
        System.out.println(lista);

        Collections.sort(lista, new ComparatorPorNotaDescendente());
        System.out.println(lista);

        Set<Integer> setSinOrden = Set.of(1,3,6,2,7);
        Set<Integer> setOrdenado = new TreeSet<>(setSinOrden);
        System.out.println(setOrdenado);

        Set<Integer> setConOtroOrden = new TreeSet<>(Comparator.reverseOrder());
        setConOtroOrden.addAll(setSinOrden);
        System.out.println(setConOtroOrden);
    }
}
