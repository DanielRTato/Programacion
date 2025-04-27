package FileWriterYReader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEjemplo {
    public static void main(String[] args) {

        String texto = "Este es un ejemplo de uso de FileWriter en java";
        String fichero = "fichero.txt";

        try {
            // Creamos un objeto FileWriter
            FileWriter fileWriter = new FileWriter(fichero,true); // con el append depende de si es true op false piso el contenido o lo añado

            // Escribimos el String en el archivo
            fileWriter.write(texto);

            // Cerrar el FilwWriter
            fileWriter.close();
            System.out.println("Se ha escrito en el fichero correctamen");
        }catch (IOException e){
            System.out.println("Error al escribir en el archivo");
            e.printStackTrace();
        }
    }
}
