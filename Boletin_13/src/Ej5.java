import java.util.ArrayList;
import java.util.Scanner;

/**
 * Deseña a aplicación que solicite por consola números enteiros ata que se
 * introduce o -1. Os números positivos se gardarán nunha colección. O
 * programa mostrará por pantalla os enteiros apuntados cun índice par,
 * multiplicados por 100.
 */
public class Ej5 {
    public static void main(String[] args) {
        // Crear unha colección para gardar os números positivos
        ArrayList<Integer> numerosPositivos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce números enteiros (introduce -1 para rematar):");

        // Bucle para solicitar números ata que se introduza -1
        while (true) {
            System.out.print("Introduce un número: ");

            // Comprobar se o input é un número enteiro
            if (!scanner.hasNextInt()) {
                System.out.println(" Error: Debes introducir un número enteiro.");
                scanner.next(); // Limpar o buffer
                continue;
            }

            int numero = scanner.nextInt();

            // Comprobar se é o número de saída (-1)
            if (numero == -1) {
                break;
            }

            // Gardar só os números positivos
            if (numero > 0) {
                numerosPositivos.add(numero);
            }
        }

        // Mostrar os números con índice par multiplicados por 100
        System.out.println("\nResultados:");
        for (int i = 0; i < numerosPositivos.size(); i++) {
            if (i % 2 == 0) { // Comprobar se o índice é par
                int resultado = numerosPositivos.get(i) * 100;
                System.out.println("Índice " + i + ": " + numerosPositivos.get(i) + " × 100 = " + resultado);
            }
        }

        scanner.close();
    }
}