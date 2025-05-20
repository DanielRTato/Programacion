package colecciones;

import com.sun.source.tree.Tree;

import java.util.*;

// Maneja pares clave-valor
// Cada clave tiene un unico valor
// NO hereda de Collection
public class EjemploMap {
    public static void main(String[] args) {

        Map<Integer, String> map1 = Map.of(1, "Uno", 2, "Dos", 3, "Tres");

        Map<Integer, String> map2 = Map.ofEntries(
                Map.entry(1, "Uno"),
                Map.entry(2, "Dos"),
                Map.entry(3, "Tres")
        ); 

        // put(clave, valor) asocia cla y valor, si existe una clave, reemplaza el valor
        // putIfAbsent(clave, valor) asocia cla y valor, si existe una clave, no hace nada
        Map<Integer, String> map3 = new HashMap<>();
        map3.put(1, "Uno");
        map3.put(2, "Dos");
        map3.put(3, "Tres");
        System.out.println(map3.get(3));
        System.out.println(map3.getOrDefault(4, "No encontrado"));

        // Obtener los elementos de un Map
        for (int n : map3.keySet()) {
            System.out.println(n + ": " + map3.get(n));
        }

        LinkedHashMap<String, String> linked = new LinkedHashMap<>();
        linked.put("1", "Uno");
        linked.put("2", "Dos");
        linked.put("3", "Tres");
        System.out.println();
        for(String s: linked.keySet()){
            System.out.println(s + ": " + linked.get(s)  );
        }

        TreeMap<Integer, Integer> cuadrados = new TreeMap<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(100);
            cuadrados.put(num, num * num);
        }
        Map.Entry<Integer, Integer> menos = cuadrados.firstEntry();
        System.out.println(menos.getKey() + " - " + menos.getValue());


    }
}
