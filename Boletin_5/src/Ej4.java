import java.util.Scanner;
/**
 * Codifica un programa que solicite un número e visualice a táboa de multiplicar dese número.
 * O programa seguirá pedindo números ata que o usuario pulse o número cero.
 */
public class Ej4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Introduce un numero");
            int numero = scan.nextInt();

            if (numero ==0){
                break;
            }

            for (int i = 0; i<=10; i++){
                System.out.println(numero*i);
            }

        }
        scan.close();
    }
}
