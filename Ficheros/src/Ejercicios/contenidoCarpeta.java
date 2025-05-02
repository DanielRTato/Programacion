package Ejercicios;

import java.io.File;

/**
 * Método que recibe una carpeta y lista los archivo con extensión .txt (crea sobrecarga para que el método
 * reciba el tipo de archivo a listar
 */
public class contenidoCarpeta {
    public static void main(String[] args) {

        listaContenido("carpeta",".txt");
    }

    public static void  listaContenido(String carpeta, String tipo) {
        File directorio = new File(carpeta);
        System.out.println(directorio.exists());

        if (carpeta.isEmpty()) {
            System.out.println("La carpeta no contiene nungun archivo " + tipo);
        }else {
            File [] archivos = directorio.listFiles();
            for (File f: archivos) {
                if (f.isFile() && f.getName().contains("txt")){
                    System.out.println(f);
                }
            }
        }
    }




}
