import java.io.File;
import java.io.IOException;

public class Ejemplos {
    public static void main(String[] args) {

        try {
            File archivo = new File("nombre.txt");
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado " + archivo.getName());
            } else {
                System.out.println("Ya existe el archivo");
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}