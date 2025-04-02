import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploBufferReader {

    public static void main(String[] args) {
        String texto = "";
        BufferedReader entrada = null;

        try {
            entrada = new BufferedReader(new FileReader("C:\\Users\\daniv\\OneDrive\\Escritorio\\f\\Streams\\src\\ficheroTextoProba.txt"));
            String linea = entrada.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = entrada.readLine();
            }
        } catch (IOException erro) {
            System.out.println("Error en la búsqueda del fichero: " + erro.getMessage());
        } finally {
            if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException e) {
                    System.out.println("No se pudo cerrar el archivo: " + e.getMessage());
                }
            }
        }
    }
}