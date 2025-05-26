package mioExamen.Ej2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Agenda {
    private static List<Contacto> contactos = new ArrayList<>();
    private static final Scanner teclado = new Scanner(System.in);
    private static final String Archivo = "Contactos.txt";

    public static void main(String[] args) {
        cargarContactos();

        while (true) {
            System.out.println("Elige una de estas opciones (1 al 5)");
            System.out.println("1. Engadir contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Mudar o teléfono dun contacto");
            System.out.println("4. Mostrar a lista de contactos");
            System.out.println("5. Salir");
            System.out.print("Seleccione unha opción: ");

            try {
                int opcion = Integer.parseInt(teclado.nextLine());

                switch (opcion) {
                    case 1:
                        añadirContacto();
                        break;
                    case 2:
                        eliminarContacto();
                        break;
                    case 3:
                        mudatTelefono();
                        break;
                    case 4:
                        mostrarContactos();
                        break;
                    case 5:
                        gardarInformacion();
                        System.out.println("Gardando datos e saíndo do sistema...");
                        teclado.close();
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

    private static void añadirContacto() {
        try {
            // Solicitar datos de la tarea
            System.out.print("Nombre del contacto: ");
            String nombre = teclado.nextLine();

            System.out.print("Teléfono: ");
            String telefono = teclado.nextLine();

            Contacto contact = new Contacto(nombre, telefono);
            contactos.add(contact);
            System.out.println("Contacto añadido");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void mudatTelefono() {
        System.out.println("Introduce el nombre del contacto");
        String nombreCambiar = teclado.nextLine();
        int posicion = 0;
        for ( Contacto c: contactos) {
            if (c.getNome().equals(nombreCambiar)) {
                System.out.println("Introduce el numero nuevo");
                String nuevo = teclado.nextLine();
                c.setTelefono(nuevo);
            }
        }

    }




    private static void eliminarContacto() {
        if (contactos.isEmpty()) {
            System.out.println("No existe el contactos");
            return;
        }

        System.out.println("Contactos existentes:");
        for (int i = 0; i < contactos.size(); i++) {
            System.out.println((i + 1) + ". " + contactos.get(i).getNome() +
                    " (" + contactos.get(i).getTelefono() + ")");
        }

        System.out.print("Seleccione el contacto a eliminar (Estan ordenados por numero): ");
        try {
            int seleccion = Integer.parseInt(teclado.nextLine()) - 1;

            if (seleccion < 0 || seleccion >= contactos.size()) {
                System.out.println("Selección non válida.");
                return;
            }

            Contacto contact = contactos.get(seleccion);
            contactos.remove(seleccion);
            System.out.println("Nombre: " +  contact.getNome() + " fue borrado correctamente.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número válido.");
        }
    }

    private static void mostrarContactos() {
        List<Contacto> listado = contactos.stream()
                .collect(Collectors.toList());

        if (listado.isEmpty()) {
            System.out.println("Non hay contactos.");
            return;
        }

        listado.forEach(System.out::println);
        System.out.println("Total: " + listado.size() );
    }


    private static void gardarInformacion() {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(Archivo))) {
            oos.writeObject(contactos);
            System.out.println("Contactos guardados en " + Archivo);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    private static void cargarContactos() {
        File arquivo = new File(Archivo);
        if (!arquivo.exists()) {
            System.out.println("Non se encontró el archivo o no existe.");
            return;
        }
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(Archivo))) {
            contactos = (List<Contacto>) ois.readObject();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No existe el archivo o");
        }
    }
}
