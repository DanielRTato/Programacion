import java.util.HashSet;
import java.util.Set;

/**
 Conxunto de 20 numeros enteros entre 1 y 10;
 Conxunto de elementos sin repeticion
 Conxunto con repetidos
 Conxunto con elementos únicos
 */
public class Ej1Clase {
    public static void main(String[] args) {

        // Creando el array con los 20 números
        int[] numeros = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) Math.floor(Math.random() * 10 + 1);
        }

        // Imprimir los números generados
        System.out.print("Números generados: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        Set<Integer> numerosSinRepeticion = new HashSet<>();
        Set<Integer> numerosVistos = new HashSet<>();
        Set<Integer> numerosRepetidos = new HashSet<>();
        Set<Integer> numerosUnicos = new HashSet<>();

        for (int numero : numeros) {
            if (!numerosVistos.add(numero)) {
                numerosRepetidos.add(numero);
                numerosUnicos.remove(numero);
            } else {
                numerosUnicos.add(numero);
            }
            numerosSinRepeticion.add(numero);
        }

        System.out.println("Conxunto sin repeticiones: " + numerosSinRepeticion);
        System.out.println("Conjunto solo con los repetidos: " + numerosRepetidos);
        System.out.println("Conxunto con los elementos únicos: " + numerosUnicos);
    }
}