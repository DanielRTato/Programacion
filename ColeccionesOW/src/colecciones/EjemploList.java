package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
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
        List<Integer> lista3 = new ArrayList<>();
        lista3.add(10);
        lista3.add(20);
        lista3.addAll(List.of(1,2,3,4,5));
        lista3.add(6);
        System.out.println(lista3);




    }


}
