package Ej1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Integer[] numeros1 = {1,2,3,4,5};
        Integer [] numeros2 = {6,7,8,9,10};

        juntarArrays<Integer> juntar = new juntarArrays<>(numeros1,numeros2);

        Integer[] resultado = juntar.concatenar();
        System.out.println(Arrays.toString(resultado));

        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);

        }


        System.out.println("-------------------------------");

        String[] palabra1 = {"hola","mundo"};
        String [] palabra2 = {"adios", "universo"};

        juntarArrays<String> juntarPalabras = new juntarArrays<>(palabra1,palabra2);

        String resultadoPalabras[] = juntarPalabras.concatenar();
        System.out.println(Arrays.toString(resultadoPalabras));

    }
}
