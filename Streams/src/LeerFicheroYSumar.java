import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroYSumar {
    public static void main(String[] args) {
        FileReader entrada = null;
        int suma = 0, cuenta = 0;

        try {
            entrada = new FileReader("C:\\Users\\daniv\\OneDrive\\Escritorio\\f\\Streams\\src\\numeros.txt");

            int caracter = entrada.read();

            while (caracter != -1) {
                if (Character.isDigit((char) caracter)) {
                    suma += Character.getNumericValue((char) caracter);
                    cuenta++;
                }
                caracter = entrada.read();
            }

        } catch (IOException e) {
            System.out.println("Erro de entrada/saida: " + e.getMessage());
        } finally {
            if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException e) {
                    System.out.println("Erro de entrada/saida al cerrar: " + e.getMessage());
                }
            }
        }

        System.out.println("La suma es: " + suma);
        if (cuenta > 0) {
            System.out.println("La media es: " + (double) suma / cuenta);
        } else {
            System.out.println("No se encontraron dígitos en el archivo.");
        }
    }
}