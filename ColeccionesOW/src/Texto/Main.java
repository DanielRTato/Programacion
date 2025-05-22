package Texto;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final String ARCHIVO = "deportistas.txt";
    private static ArrayList<Deportista> deportistas = new ArrayList<>();

    public static void main(String[] args) {
        cargarDeportistas();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMENÚ DE DEPORTISTAS");
            System.out.println("1. Añadir deportista");
            System.out.println("2. Listar deportistas");
            System.out.println("3. Guardar y salir");
            System.out.print("Elige opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch(opcion) {
                case 1:
                    añadirDeportista(sc);
                    break;
                case 2:
                    listarDeportistas();
                    break;
                case 3:
                    guardarDeportistas();
                    System.out.println("Datos guardados. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while(opcion != 3);

        sc.close();
    }

    private static void añadirDeportista(Scanner sc) {
        System.out.print("DNI: ");
        String dni = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Licencia: ");
        String licencia = sc.nextLine();

        deportistas.add(new Deportista(dni, nombre, licencia));
        System.out.println("Deportista añadido correctamente");
    }

    private static void listarDeportistas() {
        if (deportistas.isEmpty()) {
            System.out.println("No hay deportistas registrados");
            return;
        }

        System.out.println("\nLISTA DE DEPORTISTAS:");
        for (Deportista d : deportistas) {
            System.out.println(d);
        }
    }

    private static void cargarDeportistas() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 3) {
                    deportistas.add(new Deportista(datos[0], datos[1], datos[2]));
                }
            }
            System.out.println("Datos cargados correctamente");
        } catch (IOException e) {
            System.out.println("Error al cargar: " + e.getMessage());
        }
    }

    private static void guardarDeportistas() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO))) {
            for (Deportista d : deportistas) {
                bw.write(d.toTexto()); // Método que genera la línea de texto
                bw.newLine();
            }
            System.out.println("Datos guardados en " + ARCHIVO);
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }
}