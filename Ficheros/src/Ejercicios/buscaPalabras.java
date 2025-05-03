package Ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *  Busca palabras en un fichero de texto con un búfer
 *  y que muestre el número de ocurrencias
 */
public class buscaPalabras {
    public static void main(String[] args) {

        buscaNPalabras("C:\\Pro3\\f\\Ficheros\\src\\Ejercicios\\ejemplo.txt", "sin" );
    }

    public static void buscaNPalabras (String ruta, String palabra) {
        int contador = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            Scanner scn = new Scanner(br);

            while (scn.hasNextLine()) {
                String[] palabrasLinea = scn.nextLine().split("\\s+");
                for (String palabraActual : palabrasLinea) {
                    if (palabraActual.equals(palabra)){
                        contador++;
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("No se pudo encontrar el archivo");
        }
        System.out.println("La palabra " + palabra + " aparece " + contador + " vecess");
    }
}
