import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListadoCanciones {
    // Lista para almacenar todas las canciones
    private static List<Cancion> canciones = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static final String ARQUIVO_LISTADO = "LISTADO.txt";

    /**
     * Metodo principal que inicia la aplicación
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        cargarListado();

        while (true) {
            System.out.println("=== Opciones ===");
            System.out.println("1. Engadir cancion");
            System.out.println("2. Borrar cancion");
            System.out.println("3. Buscar canción por titulo");
            System.out.println("4. Mostrar lisatdo de canciones");
            System.out.println("5. Gardar e saír");
            System.out.print("Seleccione unha opción: ");

            try {
                int opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        engadirCancion();
                        break;
                    case 2:
                        eliminarCancion();
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        mostrarCanciones();
                        break;
                    case 5:
                        gardarInformacion();
                        System.out.println("Gardando datos e saíndo do sistema...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opción non válida. Intente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    /**
     * Engadir nova cancion e añadila á lista
     */
    private static void engadirCancion() {
        System.out.println("--- ENGADIR CANCION ---");

        try {
            // Solicitar datos de la tarea
            System.out.print("Titulo da canción: ");
            String titulo = scanner.nextLine();

            System.out.print("Artista: ");
            String artista = scanner.nextLine();

            // Crear y agregar la nueva tarea
            Cancion cancion = new Cancion(titulo, artista);
            canciones.add(cancion);
            System.out.println("Cancion creada correctamente.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    

    /**
     * Borra una cancion de la lista
     */
    private static void eliminarCancion() {
        System.out.println("--- BORRAR CANCION ---");

        // Mostrar todas las tareas para selección
        if (canciones.isEmpty()) {
            System.out.println("Non hay canciones rexistradas.");
            return;
        }

        System.out.println("Canciones rexistradas:");
        for (int i = 0; i < canciones.size(); i++) {
            System.out.println((i + 1) + ". " + canciones.get(i).getTitulo() +
                    " (" + canciones.get(i).getArtista() + ")");
        }

        System.out.print("Seleccione a cancion a borrar: ");
        try {
            int seleccion = Integer.parseInt(scanner.nextLine()) - 1;

            if (seleccion < 0 || seleccion >= canciones.size()) {
                System.out.println("Selección non válida.");
                return;
            }

            Cancion cancion = canciones.get(seleccion);
            canciones.remove(seleccion);
            System.out.println("Canción '" + cancion.getTitulo() + "' borrada correctamente.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número válido.");
        }
    }

    

    /**
     * Muestra tudo el listado de canciones
     */
    private static void mostrarCanciones() {
        System.out.println("--- CANCIONES REGISTRADAS ---");
        List<Cancion> listado = canciones.stream()
                .collect(Collectors.toList());

        if (listado.isEmpty()) {
            System.out.println("Non hay canciones.");
            return;
        }

        listado.forEach(System.out::println);
        System.out.println("Total: " + listado.size() );
    }


    /**
     * Guarda las tareas en un archivo binario
     */
    private static void gardarInformacion() {
        // Try-with-resources para garantizar que el ObjectOutputStream se cierre
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(ARQUIVO_LISTADO))) {
            oos.writeObject(canciones);
            System.out.println("Tarefas gardadas en " + ARQUIVO_LISTADO);
        } catch (IOException e) {
            System.err.println("Error ao gardar as tarefas: " + e.getMessage());
        }
    }

    /**
     * Carga las tareas desde un archivo binario
     */
    @SuppressWarnings("unchecked")
    private static void cargarListado() {
        File arquivo = new File(ARQUIVO_LISTADO);

        // Verificar si el archivo existe antes de intentar leerlo
        if (!arquivo.exists()) {
            System.out.println("Non se encontró arquivo de tarefas. Comezando con lista baleira.");
            return;
        }

        // Try-with-resources para garantizar que el ObjectInputStream se cierre
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(ARQUIVO_LISTADO))) {
            canciones = (List<Cancion>) ois.readObject();
            System.out.println("Tarefas cargadas desde " + ARQUIVO_LISTADO);
        } catch (IOException e) {
            System.err.println("Error ao cargar as tarefas: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Clase non encontrada ao cargar tarefas");
        }
    }
}
