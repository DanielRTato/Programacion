package Buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class EjercicioBufferdReader {
    public static void main(String[] args) {

        String archivo = "nombre.txt";

    }

    public static int contarPalabras(String nombreFichero) {

        int contadorPalabras = 0;
        try {
            FileReader fr = new FileReader(nombreFichero);
            BufferedReader fw = new BufferedReader(fr);

            while (fw.ready()) {

            }


        } catch (FileNotFoundException e) {
            System.out.println("Error al buscar el archivo");
            e.printStackTrace();
        }

        return 0;
    }
}
