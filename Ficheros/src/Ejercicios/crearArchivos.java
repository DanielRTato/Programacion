package Ejercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Crea n archivos, nombre(n).txt en la carpeta que el usuario elija
 * Dentro de cada archivo escribe la frase "Este es el fichero nombre(n).txt"
 */
public class crearArchivos {
    public static void main(String[] args) {

        creaArchivos("C:\\Pro3\\f\\carpeta",5);
    }

    public static void creaArchivos(String ruta, int cantidad) {
        for (int i  = 1; i <= cantidad; i++) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(ruta +"nombree" + i + ".txt"));
                writer.write("Este es e fichero nombre" + i + ".txt");
            } catch (IOException e) {
                System.out.println("Error al crear el fichero");
                e.printStackTrace();
            }
        }

    }
}
