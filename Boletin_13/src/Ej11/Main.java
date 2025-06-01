package Ej11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Character, Academico> academia = new TreeMap<>(); // Ordenado por clave

        // Crear e inserir 5 académicos
        nuevoAcademico(academia, new Academico("Xulia López", 2015), 'A');
        nuevoAcademico(academia, new Academico("Manuel Pérez", 2008), 'M');
        nuevoAcademico(academia, new Academico("Ana Torres", 2020), 'T');
        nuevoAcademico(academia, new Academico("Carlos Gómez", 2012), 'C');
        nuevoAcademico(academia, new Academico("Beatriz Díaz", 2010), 'B');

        // Listado sen letra, por orde de nome
        System.out.println("\n📚 Académicos (orde por nome):");
        List<Academico> listaPorNome = new ArrayList<>(academia.values());
        Collections.sort(listaPorNome);
        for (Academico a : listaPorNome) {
            System.out.println(a);
        }

        // Listado sen letra, por ano de ingreso
        System.out.println("\n📆 Académicos (orde por ano de ingreso):");
        List<Academico> listaPorAno = new ArrayList<>(academia.values());
        listaPorAno.sort(Comparator.comparingInt(Academico::getAnoIngreso));
        for (Academico a : listaPorAno) {
            System.out.println(a);
        }

        // Listado con letra (ordenado por clave)
        System.out.println("\n🔠 Académicos por sillón (letra):");
        for (Map.Entry<Character, Academico> entry : academia.entrySet()) {
            System.out.println("Letra " + entry.getKey() + " → " + entry.getValue());
        }
    }

    // Metodo estático para inserir novo académico
    public static boolean nuevoAcademico(Map<Character, Academico> academia, Academico novo, Character letra) {
        if (!Character.isLetter(letra)) {
            System.out.println("❌ '" + letra + "' non é unha letra válida.");
            return false;
        }
        if (academia.containsKey(letra)) {
            System.out.println("⚠ Xa existe un académico no sillón '" + letra + "'.");
            return false;
        }
        academia.put(letra, novo);
        return true;
    }
}
