package Ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *  Busca palabras en un fichero de texto con un búfer
 *  y que muestre el número de ocurrencias
 */
public class buscaPalabras {
    public static void main(String[] args) {

        buscaNPalabras("ejemplo.txt", "sin" );
    }

    public static void buscaNPalabras (String ruta, String palabra) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("ruta"));

        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo");
        }
    }
}
