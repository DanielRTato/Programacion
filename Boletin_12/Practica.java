import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practica {
    public static void main(String[] args) {

        leerFichero accediento = new leerFichero();
        accediento.lee();

    }
}

class leerFichero {

    public void lee (){
        try {
            FileReader entrada = new FileReader("nombre.txt");

            int c = entrada.read();

            while (c != -1) {
                c = entrada.read();
                char letra = (char) c;
                System.out.print(letra);
            }
        } catch ( IOException e) {
            System.out.println("Archivo no encontrado");
        }
    }

}