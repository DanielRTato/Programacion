package EjemploIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejemplo1 {
    public static void main(String[] args) {

        ArrayList<String> ciudades = new ArrayList<String>();
        ciudades.add("New York");
        ciudades.add("Tokyo");
        ciudades.add("París");
        System.out.println("Ciudades: ");

        Iterator<String> it = ciudades.iterator();
        it.next();
        it.remove();

        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }


        ArrayList<String> clientes = new ArrayList<String>();
        clientes.add("Pepe García");
        clientes.add("Toni Pérez");
        clientes.add("Marta Gómez");
        clientes.add("Sara Martínez");

        Iterator<String> clienteIterator = clientes.iterator();
        while (clienteIterator.hasNext()){
            String cliente = clienteIterator.next();
            if (cliente.equals("Toni Pérez")) clienteIterator.remove();
            System.out.println(cliente);
        }
        System.out.println(clientes);



    }
}
