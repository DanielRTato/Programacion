import java.util.Scanner;
/**
 * programa que solicite 10 números por consola e calcule a súa suma.
 * Si o usuario introduce en  999,
 * deixa de solicitar máis números
 */
public class Ej8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int contador = 0;
        int resultado = 0;

        do {
            System.out.println("Introduce un numero");
            int numero = scan.nextInt();

            if (numero==999) break;

            contador++;
            resultado +=numero;
        }
        while (contador<10);

        System.out.println("El resultado de la suma es: " +resultado);
    }
}
