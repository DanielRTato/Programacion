package EjemploExamen1;

import java.util.*;
import java.util.stream.Collectors;

public class EstadisticasDeportistas {
    public static Map<String, Long> contarPorDeporte(List<Deportista> deportistas) {
        return deportistas.stream()
                .collect(Collectors.groupingBy(
                        Deportista::getDeporte,
                        Collectors.counting()
                ));
    }

    public static void mostrarEstatisticas(List<Deportista> deportistas) {
        if (deportistas.isEmpty()) {
            System.out.println("Non hai deportistas rexistrados");
            return;
        }

        Map<String, Long> contador = contarPorDeporte(deportistas);

        System.out.println("\n=== ESTATÍSTICAS ===");
        System.out.printf("%-15s %s%n", "DEPORTE", "Nº DEPORTISTAS");
        contador.forEach((deporte, count) ->
                System.out.printf("%-15s %d%n", deporte, count));

        System.out.println("\nTotal deportistas: " + deportistas.size());
    }

    public static void mostrarPorDeporte(List<Deportista> deportistas, String deporte) {
        List<Deportista> filtrados = deportistas.stream()
                .filter(d -> d.getDeporte().equalsIgnoreCase(deporte))
                .sorted(Comparator.comparing(Deportista::getNome))
                .collect(Collectors.toList());

        if (filtrados.isEmpty()) {
            System.out.println("Non hai deportistas de " + deporte);
            return;
        }

        System.out.println("\nDeportistas de " + deporte + ":");
        filtrados.forEach(System.out::println);
    }
}
