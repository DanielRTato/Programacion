package PrintWriterScanner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class AmbosJuntos {
    public static void main(String[] args) {

        try {
            String nombreFichero = "ficherosEnteros.txt";
            PrintWriter pwr = new PrintWriter(nombreFichero);

            for (int i = 1; i <=1000; i++) {
                pwr.print(i + " ");
                if ( i % 100 == 0){
                    pwr.println();
                }
                pwr.close();

                Scanner scn = new Scanner(new FileReader(nombreFichero));
                while (scn.hasNext()) {
                    System.out.println("Valor leído: " + scn.nextInt());

                }
            }
        }catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
    }
}
