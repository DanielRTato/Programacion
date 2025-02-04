package src;

/**
 * Crear a función que permíta realizar un analisis simple de texto.
 * O analizador ten a función de contar palabras,
 * caracteres e encontrar a palabra mais longa. Mostrar os resultados por pantalla.
 */
public class Ej12 {
    public static void main(String[] args) {
        String cadea = "fghfghfgh fgh fgh fh fhfg hfghfghfghf";
        analizador(cadea);
    }

    public static void analizador(String cadea) {
        //pasar a array
        String[] palabras = cadea.split(" ");
        //contar palabras
        System.out.println("Numero de palabras: " + palabras.length);
        //contar letras y palabra mas larga
        int contadorLetras = 0;
        String palabraMasLarga = "";
        for (int i = 0; i < cadea.length(); i++) {
            if (cadea.charAt(i) != ' ') {
                contadorLetras++;
            }
        }
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > palabraMasLarga.length()) {
                palabraMasLarga = palabras[i];
            }
        }
        System.out.println("Numero de letras: " + contadorLetras);
        System.out.println("Palabra mas larga: " + palabraMasLarga);
        System.out.println("El numero de palabras: "+palabras.length);
    }
}

