import java.io.FileNotFoundException;
import java.io.FileReader;

public class Practica {
    public static void main(String[] args) {


    }
}

class leerFichero {

    public void lee (){
        try {
            FileReader entrada = new FileReader("nombre.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
    }

}