package Buffered;

import java.io.*;
import java.nio.Buffer;

public class EjercicioBufferedWriter {
    public static void main(String[] args) {


        crearLineas("nuevoArchivo.txt",5);



    }

    public static void  crearLineas(String nombreFichero, int numLineas) {
        try {
            FileWriter fw = new FileWriter(nombreFichero);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i=1; i<=numLineas; i++) {
                bw.write("Esta es la linea " + i);
                bw.newLine();
            }
            // Al cerrar el BufferedWriter se cierra el FileWriter tambien
            bw.close();
            System.out.println(nombreFichero + " creado con " + numLineas + " lineas");

        } catch (IOException e) {
            System.out.println("Archivo no econtrado" + e.getMessage());;
        }
    }
}
