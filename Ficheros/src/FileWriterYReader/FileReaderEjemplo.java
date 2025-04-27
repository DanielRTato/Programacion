package FileWriterYReader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEjemplo {
    public static void main(String[] args) {

        String fichero = "fichero.txt";

        try {
            FileReader fileReader = new FileReader(fichero);

            // Leer y mostrar el contenido del archivo
            int caracter;
            System.out.println("Contenido del archivo " + fichero + ": ");
            while ((caracter = fileReader.read()) != -1){
                System.out.println((char) caracter);
            }
            fileReader.close();
        }catch (IOException e){
            System.out.println("Error al leer el archivo");
            e.printStackTrace();
        }

    }
}
