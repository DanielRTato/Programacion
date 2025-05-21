package Ej9;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Rexistro> rexistros = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static final String nomeFicheiro = "rexistros" + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + ".dat";

    public static void main(String[] args) {
        int opcion;
        cargarRexistros(); // Cargar rexistros se xa existen
        do {
            mostrarMenu();
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> novoRexistro();
                case 2 -> listarRexistros();
                case 3 -> mostrarEstatisticas();
                case 4 -> gardarEDesconectar();
                default -> System.out.println("Opción non válida");
            }
        } while (opcion != 4);
    }

    static void mostrarMenu() {
        System.out.println("""
                \n--- MENÚ ESTACIÓN METEOROLÓXICA ---
                1. Novo rexistro
                2. Listar rexistros
                3. Mostrar estatísticas
                4. Saír e gardar
                Escolle unha opción:
                """);
    }

    static void novoRexistro() {
        System.out.print("Introduce a temperatura en ºC: ");
        double temp = Double.parseDouble(sc.nextLine());
        rexistros.add(new Rexistro(temp));
        System.out.println("✔ Rexistro gardado correctamente.");
    }

    static void listarRexistros() {
        if (rexistros.isEmpty()) {
            System.out.println("Aínda non hai rexistros.");
        } else {
            System.out.println("--- Lista de rexistros ---");
            rexistros.forEach(System.out::println);
        }
    }

    static void mostrarEstatisticas() {
        if (rexistros.isEmpty()) {
            System.out.println("Non hai datos para calcular estatísticas.");
            return;
        }

        double min = rexistros.stream().mapToDouble(Rexistro::getTemperatura).min().getAsDouble();
        double max = rexistros.stream().mapToDouble(Rexistro::getTemperatura).max().getAsDouble();
        double avg = rexistros.stream().mapToDouble(Rexistro::getTemperatura).average().getAsDouble();

        System.out.printf("""
                \n--- Estatísticas ---
                Temperatura mínima: %.2f°C
                Temperatura máxima: %.2f°C
                Temperatura media:  %.2f°C
                """, min, max, avg);
    }

    static void gardarEDesconectar() {
        String nomeFicheiro = "rexistros" + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + ".dat";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomeFicheiro))) {
            out.writeObject(rexistros);
            System.out.println("✔ Rexistros gardados en: " + nomeFicheiro);
        } catch (IOException e) {
            System.out.println(" Erro ao gardar os rexistros: " + e.getMessage());
        }
        System.out.println("Programa rematado.");
    }
    static void cargarRexistros() {
        File ficheiro = new File(nomeFicheiro);
        if (ficheiro.exists()) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ficheiro))) {
                rexistros = (List<Rexistro>) in.readObject();
                System.out.println("✔ Rexistros cargados desde: " + nomeFicheiro);
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("⚠ Non se puideron cargar os rexistros: " + e.getMessage());
            }
        } else {
            System.out.println("ℹ Non existen rexistros previos para hoxe.");
        }
    }
}

