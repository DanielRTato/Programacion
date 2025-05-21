import java.util.*;

public class Ej6 {
    public static void main(String[] args) {
        // Xeramos unha lista con números enteiros entre 1 e 10 (algúns repetidos)
        List<Integer> lista = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 4, 7, 8, 9, 10, 1, 5, 6);

        // 1. Conxunto cos elementos sen repetir (Set elimina repetidos automaticamente)
        Set<Integer> senRepetir = new HashSet<>(lista);

        // 2. Conxunto cos elementos repetidos
        Set<Integer> repetidos = new HashSet<>();
        Set<Integer> vistos = new HashSet<>();
        for (Integer num : lista) {
            if (!vistos.add(num)) {
                repetidos.add(num);
            }
        }

        // 3. Conxunto cos elementos únicos (só aparecen unha vez)
        Set<Integer> unicos = new HashSet<>();
        for (Integer num : lista) {
            if (Collections.frequency(lista, num) == 1) {
                unicos.add(num);
            }
        }

        // Mostrar resultados
        System.out.println("Lista orixinal: " + lista);
        System.out.println("Elementos sen repetir: " + senRepetir);
        System.out.println("Elementos repetidos: " + repetidos);
        System.out.println("Elementos únicos (que só aparecen unha vez): " + unicos);
    }
}

