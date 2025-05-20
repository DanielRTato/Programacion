package Ej2yEj3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Repite o programa do exercicio 2, usando un interador para eliminar os
 * elementos
 */
public class Ej3 {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        Random r = new Random();

        // Llenamos la lista con números aleatorios entre 0 y 10
        for (int i = 0; i < 100; i++) {
            lista.add(r.nextInt(11));
        }
        System.out.println(lista);

        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            int borrar = it.next();
            if (borrar ==5 || borrar == 7) {
                it.remove();
            }
        }
        System.out.println(lista);


    }
}


