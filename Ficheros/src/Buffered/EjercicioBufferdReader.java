package Buffered;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class EjercicioBufferdReader {
    public static void main(String[] args) {

        String archivo = "nombre.txt";

        contarPalabras("nombre.txt");
    }

    public static int contarPalabras(String nombreFichero) {

        int contadorPalabras = 0;
        try {
            Scanner scn = new Scanner(new BufferedReader(new FileReader(nombreFichero)));

            while (scn.hasNextLine()) {
                contadorPalabras += Arrays.stream(scn.nextLine().split("\\s+")).count();
            }
            scn.close();
            System.out.println(nombreFichero + " contiene " + contadorPalabras + " palabras");


        } catch (IOException e) {
            System.out.println("Error al buscar el archivo");
            e.printStackTrace();
        }

        return 0;
    }
}
