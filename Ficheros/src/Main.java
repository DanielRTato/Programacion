import java.io.File;

public class Main {
    public static void main(String[] args) {

        File fichero = new File("ejemplo1.txt");

        if (fichero.exists()) {
            System.out.println("El fichero existeee");
        }else {
            System.out.println("El fichero no existe");
        }
        System.out.println("Nombre: " + fichero.getName());
        System.out.println("Longitud: " + fichero.length());
        System.out.println("Ruta absoluta: "+ fichero.getAbsolutePath());


    }
}