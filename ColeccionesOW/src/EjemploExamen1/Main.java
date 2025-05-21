package EjemploExamen1;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final GestorDeportistas gestor = new GestorDeportistas();

    public static void main(String[] args) {
        System.out.println("⚽ XESTIÓN ACADEMIA DEPORTIVA ⚾");

        int opcion;
        do {
            mostrarMenu();
            opcion = lerEnteiro(1, 7);
            procesarOpcion(opcion);
        } while (opcion != 7);

        gestor.gardarDatos();
        System.out.println("\nDatos gardados. Ata pronto!");
    }

    private static void mostrarMenu() {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Engadir deportista");
        System.out.println("2. Modificar deportista");
        System.out.println("3. Eliminar deportista");
        System.out.println("4. Listar todos");
        System.out.println("5. Buscar por DNI");
        System.out.println("6. Ver estatísticas");
        System.out.println("7. Saír");
        System.out.print("Elixe opción: ");
    }

    private static int lerEnteiro(int min, int max) {
        while (true) {
            try {
                int num = Integer.parseInt(sc.nextLine());
                if (num >= min && num <= max) return num;
                System.out.print("Debe ser entre " + min + " e " + max + ": ");
            } catch (NumberFormatException e) {
                System.out.print("Debe ser un número: ");
            }
        }
    }

    private static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> engadirDeportista();
            case 2 -> modificarDeportista();
            case 3 -> eliminarDeportista();
            case 4 -> listarDeportistas();
            case 5 -> buscarPorDni();
            case 6 -> mostrarEstatisticas();
            case 7 -> System.out.println("Pechando aplicación...");
        }
    }

    private static void engadirDeportista() {
        System.out.println("\n--- NOVO DEPORTISTA ---");

        try {
            System.out.print("DNI (8d+1l): ");
            String dni = sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Licenza (aaaadddnnnnnnn): ");
            String licenza = sc.nextLine();

            System.out.println("Data de nacemento:");
            System.out.print("Día: ");
            int dia = lerEnteiro(1, 31);
            System.out.print("Mes: ");
            int mes = lerEnteiro(1, 12);
            System.out.print("Ano: ");
            int ano = lerEnteiro(1970, 2999);

            Data data = new Data(dia, mes, ano);
            Deportista d = new Deportista(dni, nome, licenza, data);
            gestor.engadirDeportista(d);

            System.out.println("✅ Deportista engadido!");
        } catch (DniNonValido e) {
            System.out.println("❌ DNI non válido: " + e.getMessage());
        } catch (LicenzaNonValida e) {
            System.out.println("❌ Licenza non válida: " + e.getMessage());
        } catch (FormatoDataErroneo e) {
            System.out.println("❌ Data non válida: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Erro inesperado: " + e.getMessage());
        }
    }

    private static void modificarDeportista() {
        System.out.println("\n--- MODIFICAR DEPORTISTA ---");
        System.out.print("DNI do deportista: ");
        String dni = sc.nextLine();

        Deportista d = gestor.buscarPorDni(dni);
        if (d == null) {
            System.out.println("⚠️ Non existe ese deportista");
            return;
        }

        System.out.println("Datos actuais:");
        System.out.println(d);

        System.out.print("Novo nome (deixe en branco para non cambiar): ");
        String nome = sc.nextLine();

        System.out.print("Nova licenza (deixe en branco para non cambiar): ");
        String licenza = sc.nextLine();

        if (gestor.modificarDeportista(dni, nome, licenza)) {
            System.out.println("✅ Deportista modificado");
        } else {
            System.out.println("❌ Non se puido modificar");
        }
    }

    private static void eliminarDeportista() {
        System.out.println("\n--- ELIMINAR DEPORTISTA ---");
        System.out.print("DNI do deportista: ");
        String dni = sc.nextLine();

        if (gestor.eliminarDeportista(dni)) {
            System.out.println("✅ Deportista eliminado");
        } else {
            System.out.println("⚠️ Non existe ese deportista");
        }
    }

    private static void listarDeportistas() {
        List<Deportista> lista = gestor.getDeportistas();

        if (lista.isEmpty()) {
            System.out.println("\nNon hai deportistas rexistrados");
            return;
        }

        System.out.println("\n--- LISTA DE DEPORTISTAS ---");
        lista.forEach(System.out::println);
    }

    private static void buscarPorDni() {
        System.out.println("\n--- BUSCAR DEPORTISTA ---");
        System.out.print("DNI a buscar: ");
        String dni = sc.nextLine();

        Deportista d = gestor.buscarPorDni(dni);
        if (d != null) {
            System.out.println("Datos encontrados:");
            System.out.println(d);

        } else {
            System.out.println("⚠️ Non existe ese deportista");
        }
    }

    private static void mostrarEstatisticas() {
        List<Deportista> lista = gestor.getDeportistas();
        EstadisticasDeportistas.mostrarEstatisticas(lista);

        System.out.print("\nVer deportistas de (deixe en branco para cancelar): ");
        String deporte = sc.nextLine();

        if (!deporte.isBlank()) {
            EstadisticasDeportistas.mostrarPorDeporte(lista, deporte);
        }
    }
}