package src.Ej10;

import Ej10.Produto;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

import java.io.*;
import java.util.*;

public class TiendaRepostos {
    static Map<String, Produto> inventario = new HashMap<>();
    static final String FICHEIRO = "inventario.dat";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cargarInventario();

        int opcion;
        do {
            mostrarMenu();
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠ Entrada non válida.");
                continue;
            }

            switch (opcion) {
                case 1 -> darAlta();
                case 2 -> darBaixa();
                case 3 -> actualizarCantidade();
                case 4 -> visualizarInventario();
                case 5 -> gardarESair();
                default -> System.out.println("⚠ Opción incorrecta.");
            }
        } while (true);
    }

    static void mostrarMenu() {
        System.out.println("""
                \n--- MENÚ TENDA DE REPOSTOS ---
                1. Dar de alta produto
                2. Dar de baixa produto
                3. Actualizar cantidade
                4. Visualizar inventario
                5. Gardar e saír
                Escolle unha opción:
                """);
    }

    static void darAlta() {
        System.out.print("Código alfanumérico: ");
        String codigo = sc.nextLine();
        if (inventario.containsKey(codigo)) {
            System.out.println("⚠ Ese código xa existe.");
            return;
        }

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Cantidade inicial: ");
        int cant = Integer.parseInt(sc.nextLine());

        inventario.put(codigo, new Produto(codigo, nome, cant));
        System.out.println("✔ Produto engadido.");
    }

    static void darBaixa() {
        System.out.print("Código do produto a borrar: ");
        String codigo = sc.nextLine();
        if (inventario.remove(codigo) != null) {
            System.out.println("✔ Produto eliminado.");
        } else {
            System.out.println("⚠ Produto non atopado.");
        }
    }

    static void actualizarCantidade() {
        System.out.print("Código do produto: ");
        String codigo = sc.nextLine();
        Produto p = inventario.get(codigo);
        if (p != null) {
            System.out.print("Nova cantidade: ");
            int cant = Integer.parseInt(sc.nextLine());
            p.setCantidade(cant);
            System.out.println("✔ Cantidade actualizada.");
        } else {
            System.out.println("⚠ Produto non atopado.");
        }
    }

    static void visualizarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("📦 Inventario baleiro.");
        } else {
            System.out.println("--- INVENTARIO ACTUAL ---");
            for (Produto p : inventario.values()) {
                System.out.println(p);
            }
        }
    }

    static void cargarInventario() {
        File ficheiro = new File(FICHEIRO);
        if (ficheiro.exists()) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ficheiro))) {
                inventario = (Map<String, Produto>) in.readObject();
                System.out.println("✔ Inventario cargado.");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("⚠ Erro ao cargar inventario: " + e.getMessage());
            }
        } else {
            System.out.println("ℹ Non hai inventario gardado previamente.");
        }
    }

    static void gardarESair() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FICHEIRO))) {
            out.writeObject(inventario);
            System.out.println("✔ Inventario gardado en " + FICHEIRO);
        } catch (IOException e) {
            System.out.println("❌ Erro ao gardar: " + e.getMessage());
        }
        System.out.println("Programa rematado.");
        System.exit(0);
    }
}

