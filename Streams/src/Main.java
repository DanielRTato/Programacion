import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String texto = "";
        FileReader entrada = null;
        int caracter;

        try {
            entrada = new FileReader("C:\\Users\\daniv\\OneDrive\\Escritorio\\f\\Streams\\src\\ficheroTextoProba.txt");

            do {
                caracter = entrada.read();
                if (caracter != -1) {
                    texto = texto + (char) caracter;
                }
            } while (caracter != -1);
        } catch (IOException erro) {
            System.out.println("Error" + erro.getMessage());
        } finally {
            if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException erro) {
                    System.out.println(erro.getMessage());
                }
            }
        }
        System.out.println("El texto del fichero dice:\n "  + texto);

    }
}