import java.util.Scanner;
/**
 * Realizar o programa que pida un número e como resultado nos de o factorial no número (n!).
 */
public class Ej6 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Introduce un número para calcular su factorial:");
        int factorial = scan.nextInt();
        int resultado = 1;

        for (int i=1 ; i<=factorial; i++){
            resultado *= i;
        }
        System.out.println(resultado);
    }
}
