import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejemplos {
    public static void main(String[] args) {

        File archivo = new File("nombre.txt");
        // Crear un archivo
        try {

            if (archivo.createNewFile()) {
                System.out.println("Archivo creado " + archivo.getName());
            } else {
                System.out.println("Ya existe el archivo");
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        // Escribir en el archivo
        try {
            FileWriter escribir = new FileWriter("nombre.txt");
            escribir.write("Probando a escribir");
            escribir.close();
            System.out.println("Escrito con exito");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
            e.printStackTrace();
        }

        // Leer
        try {
            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                String data = lector.nextLine();
                System.out.println(data);
            }
            lector.close();
        } catch(Exception e) {
            System.out.println("Error al intentar leer el archivo");
            e.printStackTrace();
        }

        // Informacion del archivo
        System.out.println("--------------------------------------------------------------------------------------------");

        if (archivo.exists()) {
            System.out.println("Nombre del archivo : " + archivo.getName());
            System.out.println("Absolute path: " + archivo.getAbsolutePath());
            System.out.println("Writeable: " + archivo.canWrite());
            System.out.println("Readable " + archivo.canRead());
            System.out.println("Tamaño en  bytes " + archivo.length());
        }

    }
}