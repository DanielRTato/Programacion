package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EjemploList {
    public static void main(String[] args) {

        List<String> lista = Arrays.asList("Uno", "Dos", "Tres", "Cuatro", "Cinco");
        lista.set(0, "Cero"); // Modificamos el elemento en la posición 0
        System.out.println(lista);

        List<Integer> lista2 =List.of(1, 2, 3, 4, 5);

        List<Producto> listaProductos = List.of(
                new Producto( "Boli", 1.25),
                new Producto( "Folios", 4.0),
                new Producto( "Goma", 300.0)
        );

        System.out.println(listaProductos);
        listaProductos.get(1).precio = 5.0; // Modificamos el precio del producto en la posición 1
        System.out.println(listaProductos);

        // Ejemplo de ArrayList
        List<Integer> lista3 = new ArrayList<>(); // Creamos una lista vacía
        lista3.add(10); // Añadimos elementos a la lista
        lista3.add(20);
        lista3.addAll(List.of(1,2,3,4,5)); // Añadimos una lista a la lista como un solo elemento
        lista3.add(6);
        System.out.println(lista3); // Imprimimos la lista

        // Recorremos la lista con un bucle for-each
        for(int n : lista3) {
            System.out.println(n); // Imprimimos cada elemento de la lista
        }

        for(Iterator<Integer> it = lista3.iterator(); it.hasNext(); ) {
            int n = it.next();
           if (n %10 == 0 || n == 5) {
               it.remove();
           }
        }
        System.out.println(lista3); // Imprimimos la lista después de remover los elementos que cumplen la condición

        // Ejemplos de buscar la posición de un elemento en la lista
        int pos = lista3.indexOf(2); // Buscamos la posición del elemento 5 en la lista si no lo encuentra, devuelve -1
        System.out.println("La posicion: " + pos);
        lista3.addAll(Arrays.asList(5,6,7,8,9,1));
        pos = lista3.lastIndexOf(1); // Buscamos la última posición del elemento 1 en la lista si no lo encuentra, devuelve -1
        System.out.println("La ultima posicion: " + pos);

        // Ejempos de contains
        boolean contains = lista3.contains(5); // Comprobamos si la lista contiene el elemento 5
        System.out.println(contains);
        contains = lista3.containsAll(List.of(5,6,7)); // Comprobamos si la lista contiene todos los elementos de la lista de entrada
        System.out.println(contains);

        // Ejemplos de borrar
         /*
        lista3.clear(); // Eliminamos todos los elementos de la lista
        boolean empty = lista3.isEmpty(); // Comprobamos si la lista está vacía
        System.out.println(empty);
        */

        // Ejemplo de modificar una posicion y borrar varios elementos
        lista3.set(0, 12345);
        System.out.println(lista3);
        lista3.removeAll(List.of(1,2,3,4));
        System.out.println(lista3);

        // Ejemplo de sublistas si modificas la lista original deberías tener en cuenta que también se modificarán las sublistas
        System.out.println("---------------------");
        List<Integer> sublista3 = lista3.subList(0, 3); // Creamos una sublista desde la posición 0 hasta la posición 2
        System.out.println(sublista3);
        lista3.set(0, 99);
        System.out.println(lista3);
        System.out.println(sublista3);
        sublista3.add(00);
        System.out.println(lista3);
        System.out.println(sublista3);

        // Convertir la lista en array
        String [] array = new String[lista3.size()];
        array = lista.toArray(array);
        System.out.println(Arrays.toString(array));

    }


}
