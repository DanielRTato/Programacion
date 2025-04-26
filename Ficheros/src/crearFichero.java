import java.io.File;
import java.io.IOException;

public class crearFichero {
    public static void main(String[] args) {

        // Crear archivo
        File archivo  = new File("nuevoArchivo.txt");
        try {
            if (archivo.createNewFile()){
                System.out.println("Archivo creado");
            }else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Crear carpeta
        File directorio = new File("nuevoDirectorio");
        if (directorio.mkdir()) {
            System.out.println("Directorio creado");
        }else {
            System.out.println("No se puedo crear el directorio o ya existe");
        }

        // Borrar archivo
        File archivoBorrar = new File("archivoEliminar.txt");
        if (archivoBorrar.delete()) {
            System.out.println("Archivo eliminado");
        }else {
            System.out.println("No se pudo eliminar el archivo");
        }

        // Listar carpeta
        File directorio2 = new File(".");
        String [] archivos = directorio2.list();
        System.out.println("\nLista de archivos: ");
        if (archivos != null){
            for (String a : archivos){
                System.out.println(a);
            }
        }else {
            System.out.println("No se puedo listar los archivos");
        }

    }
}
