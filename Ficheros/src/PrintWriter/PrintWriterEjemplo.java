package PrintWriter;

import java.io.*;
import java.util.Arrays;

public class PrintWriterEjemplo {
    public static void main(String[] args) {

        String fichero = "ejemplo.txt";
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(fichero,true));
            pw.print("Esto es un texto sin salto de línea");
            pw.println("Nueva palabra");
            pw.println("Esto es un texto con salto de línea");
            pw.println(4.5455);

            Arrays.stream(new int[] {1,2,3,4,10})
                    .filter(n -> n > 2)
                    .map(n -> n * 2)
                    .forEach(n -> pw.println(n));
            pw.close();
        }catch (FileNotFoundException e){
            System.out.println("Fichero no encontrado");
        }catch (IOException e){
            System.out.println("Problemas al escribir en el fichero");
        }
    }
}
