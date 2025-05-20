import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Crea a aplicación onde se piden por consola números reais ata que se
 * introduce un 0. A medida que se len do teclado, os valores positivos se
 * introducen nunha colección e os negativos noutra. A aplicación, mostrara as
 * dúas coleccións e as sumas dos elementos de cada unha delas. O fin,
 * eliminaranse das dúas coleccións os elementos maiores de 10 e menores de
 * -10 e se voltan
 */
public class Ej4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<Integer> numerosPositivos = new ArrayList<>();
        List<Integer> numerosNegativos = new ArrayList<>();


        int numero;
        do {
            System.out.println("Ingrese un número: ");
            numero = teclado.nextInt();
            if (numero > 0 ){
                numerosPositivos.add(numero);
            } else if (numero < 0) {
                numerosNegativos.add(numero);
            }
        } while (numero != 0);

        System.out.println("Números positivos: " + numerosPositivos);
        System.out.println("Números negativos: " + numerosNegativos);

        int sumaTotalPositivos = 0;
        for (int n : numerosPositivos) {
            sumaTotalPositivos += n;
        }
        System.out.println("La sumna total de los numeros positivos es: " + sumaTotalPositivos);

        int sumaTotalNegativos = 0;
        for (int n : numerosNegativos) {
            sumaTotalNegativos += n;
        }
        System.out.println("La sumna total de los numeros negativos es: " + sumaTotalNegativos);

        // Eliminamos los valores mayores de 10 y menores de -10
        numerosPositivos.removeIf(n -> n > 10);
        numerosNegativos.removeIf(n -> n < -10);
        System.out.println("Números positivos tras eliminar los mayores de 10 : " + numerosPositivos);
        System.out.println("Números negativos tras eliminar los menores de -10: " + numerosNegativos);
    }
}
