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


    }
}
