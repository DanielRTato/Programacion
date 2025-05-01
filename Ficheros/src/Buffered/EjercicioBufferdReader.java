package Buffered;

import java.io.*;

public class EjercicioBufferdReader {
    public static void main(String[] args) {

        String archivo = "nombre.txt";

        contarPalabras("nombre.txt");
    }

    public static int contarPalabras(String nombreFichero) {

        int contadorPalabras = 0;
        try {
            FileReader fr = new FileReader(nombreFichero);
            BufferedReader br = new BufferedReader(fr);
            String linea;

            while (( linea= br.readLine()) != null ) {
                String []  palabrasLinea = linea.split("\\s+");
                contadorPalabras += palabrasLinea.length;
            }
            br.close();
            System.out.println(nombreFichero + " contiene " + contadorPalabras + " palabras");


        } catch (IOException e) {
            System.out.println("Error al buscar el archivo");
            e.printStackTrace();
        }

        return 0;
    }
}
