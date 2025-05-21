package EjemploSimple;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final GestorDeportistas gestor = new GestorDeportistas();

    public static void main(String[] args) {
        System.out.println("⚽ XESTIÓN ACADEMIA DEPORTIVA ⚾");

        int opcion;
        do {
            mostrarMenu();
            opcion = lerEnteiro(1, 6);
            procesarOpcion(opcion);
        } while (opcion != 6);

        gestor.gardarDatos();
        System.out.println("\n✅ Datos gardados. Ata pronto!");
    }

    private static void mostrarMenu() {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Engadir deportista");
        System.out.println("2. Listar deportistas");
        System.out.println("3. Buscar por DNI");
        System.out.println("4. Eliminar deportista");
        System.out.println("5. Ver deportistas por deporte");
        System.out.println("6. Gardar e saír");
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
            case 2 -> listarDeportistas();
            case 3 -> buscarPorDni();
            case 4 -> eliminarDeportista();
            case 5 -> mostrarPorDeporte();
            case 6 -> System.out.println("Pechando aplicación...");
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
        } catch (DniNonValido | LicenzaNonValida | FormatoDataErroneo e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    private static void listarDeportistas() {
        var lista = gestor.getDeportistas();

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
            System.out.println("🔍 Resultado:");
            System.out.println(d);
        } else {
            System.out.println("⚠️ Non existe ese deportista");
        }
    }

    private static void eliminarDeportista() {
        System.out.println("\n--- ELIMINAR DEPORTISTA ---");
        System.out.print("DNI a eliminar: ");
        String dni = sc.nextLine();

        if (gestor.eliminarDeportista(dni)) {
            System.out.println("✅ Deportista eliminado");
        } else {
            System.out.println("⚠️ Non existe ese deportista");
        }
    }

    private static void mostrarPorDeporte() {
        System.out.println("\n--- DEPORTISTAS POR DEPORTE ---");
        System.out.print("Introduce o deporte (Fútbol, Baloncesto, Tenis...): ");
        String deporte = sc.nextLine();

        var lista = gestor.getDeportistas().stream()
                .filter(d -> d.getDeporte().equalsIgnoreCase(deporte))
                .toList();

        if (lista.isEmpty()) {
            System.out.println("Non hai deportistas de " + deporte);
            return;
        }

        System.out.println("\nDeportistas de " + deporte + ":");
        lista.forEach(System.out::println);
    }
}