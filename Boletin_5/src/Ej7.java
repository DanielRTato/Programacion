/**
 *  Solicita o usuario un número n e debuxa un triángulo de base e altura n
 */
import java.util.Scanner;
public class Ej7 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int n;

        System.out.println("Introduce un numero para dibujar el triangulo");
        n = scan.nextInt();

        for (int i = 0; i<n; i++){
            System.out.println("*");

        }

    }
}
