package CancionExamen;

import java.util.*;

public class XestorCancions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cancion> lista = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Engadir canción");
            System.out.println("2. Eliminar canción");
            System.out.println("3. Buscar canción por título");
            System.out.println("4. Mostrar lista de cancións");
            System.out.println("5. Saír");
            System.out.print("Elixe unha opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Artista: ");
                    String artista = sc.nextLine();
                    lista.add(new Cancion(titulo, artista));
                    break;
                case 2:
                    System.out.print("Título da canción a eliminar: ");
                    String eliminar = sc.nextLine();
                    boolean eliminada = lista.removeIf(c -> c.getTitulo().equalsIgnoreCase(eliminar));
                    if (eliminada)
                        System.out.println("Canción eliminada.");
                    else
                        System.out.println("Canción non atopada.");
                    break;
                case 3:
                    System.out.print("Título da canción a buscar: ");
                    String buscar = sc.nextLine();
                    boolean atopada = false;
                    for (Cancion c : lista) {
                        if (c.getTitulo().equalsIgnoreCase(buscar)) {
                            System.out.println("Atopada: " + c);
                            atopada = true;
                        }
                    }
                    if (!atopada)
                        System.out.println("Canción non atopada.");
                    break;
                case 4:
                    System.out.println("Lista de cancións:");
                    for (Cancion c : lista) {
                        System.out.println(c);
                    }
                    break;
                case 5:
                    System.out.println("Saíndo...");
                    break;
                default:
                    System.out.println("Opción non válida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
