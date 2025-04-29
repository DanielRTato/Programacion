package PrintWriterScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEjemplo {
    public static void main(String[] args) {

        File archivo = new File("ejemplo.txt");
        try {
            Scanner scn = new Scanner(archivo);

            while (scn.hasNextLine()) {
                String linea = scn.nextLine();
                System.out.println(linea);
            }
            scn.close();
        }catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
    }
}
