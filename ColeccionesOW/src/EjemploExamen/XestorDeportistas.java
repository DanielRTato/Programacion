package EjemploExamen;

import EjemploExamen.Data;
import EjemploExamen.Deportista;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class XestorDeportistas {
    static List<Deportista> deportistas = new ArrayList<>();
    static final String FILE = "deportistas.dat";

    public static void main(String[] args) {
        cargar();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n1. Engadir\n2. Eliminar por DNI\n3. Listar\n4. Buscar por deporte\n5. Saír");
            opcion = sc.nextInt(); sc.nextLine();
            switch (opcion) {
                case 1 -> engadir(sc);
                case 2 -> eliminar(sc);
                case 3 -> listar();
                case 4 -> buscarPorDeporte(sc);
            }
        } while (opcion != 5);
        gardar();
    }

    static void engadir(Scanner sc) {
        try {
            System.out.print("Nome: "); String nome = sc.nextLine();
            System.out.print("DNI: "); String dni = sc.nextLine();
            System.out.print("Data (d m a): "); int d = sc.nextInt(), m = sc.nextInt(), a = sc.nextInt(); sc.nextLine();
            System.out.print("Licenza: "); String lic = sc.nextLine();
            System.out.print("Deporte: "); String dep = sc.nextLine();
            deportistas.add(new Deportista(nome, dni, new Data(d, m, a), lic, dep));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void eliminar(Scanner sc) {
        System.out.print("DNI a eliminar: ");
        String dni = sc.nextLine();
        deportistas.removeIf(d -> d.getDni().equals(dni));
    }

    static void listar() {
        deportistas.stream()
                .sorted(Comparator.comparing(Deportista::getNome))
                .forEach(System.out::println);
        Map<String, Long> conta = deportistas.stream()
                .collect(Collectors.groupingBy(Deportista::getDeporte, Collectors.counting()));
        conta.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    static void buscarPorDeporte(Scanner sc) {
        System.out.print("Deporte: ");
        String dep = sc.nextLine();
        deportistas.stream().filter(d -> d.getDeporte().equalsIgnoreCase(dep)).forEach(System.out::println);
    }

    static void gardar() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {
            oos.writeObject(deportistas);
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Erro gardando ficheiro");
        }
    }

    static void cargar() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {
            deportistas = (List<Deportista>) ois.readObject();
        } catch (Exception e) {
            deportistas = new ArrayList<>(); // Ficheiro baleiro ou non existe
            System.out.println("No se puedieron guardar los datos");
        }
    }
}
