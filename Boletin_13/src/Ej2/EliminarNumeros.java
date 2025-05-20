package Ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EliminarNumeros {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        Random r = new Random();

        // Llenamos la lista con números aleatorios entre 0 y 10
        for (int i = 0; i < 100; i++) {
            lista.add(r.nextInt(11));
        }
        System.out.println(lista);

        for (int i = 0; i<lista.size(); i++) {
            int borrar = lista.get(i);
            if (borrar==5 || borrar==7) {
                lista.remove(i);
            }
        }
        System.out.println(lista);

    }
}
