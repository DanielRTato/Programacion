package Ejercicios;

import java.io.File;

/**
 * Método que recibe una carpeta y lista los archivo con extensión .txt (crea sobrecarga para que el método
 * reciba el tipo de archivo a listar
 */
public class contenidoCarpeta {
    public static void main(String[] args) {

        listaContenido(".",".txt"); //el punto quiere decir la carpeta actual
    }

    /**
     *
     * @param carpeta la carpteta donde buscar
     * @param tipo la extensión que buscas
     */
    public static void  listaContenido(String carpeta, String tipo) {
        File directorio = new File(carpeta);

        if (!directorio.exists() || !directorio.isDirectory()) {
            System.out.println("La carpeta especificada no existe o no es un directorio");
        }

        File[] archivos = directorio.listFiles();
        if (archivos == null || archivos.length == 0) {
            System.out.println("La carpeta no contiene ningún archivo con la extensión " + tipo);
        }

        for (File f : archivos) {
            if (f.isFile() && f.getName().endsWith(tipo)) {
                System.out.println(f);
            }
        }
    }
}





