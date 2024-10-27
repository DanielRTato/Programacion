import java.util.Scanner;


public class Ej4 {
    public static void main(String[] args) {

        int p1, p2;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Introduce nombre");
        String nome1 = teclado.nextLine();
        teclado = new Scanner(System.in);
        System.out.println("Introcude peso");
        p1 = teclado.nextInt();

        teclado = new Scanner(System.in);
        System.out.println("Introduce nombre2");
        String nome2 = teclado.nextLine();
        teclado = new Scanner(System.in);
        System.out.println("Introcude peso2");
        p2 = teclado.nextInt();

        if (p1 > p2) {
            System.out.println(nome1+ " es el que más pesa es y la diferencia es: " + (p1-p2));
        }
        else {
            System.out.println(nome2+ " es el que más pesa y la diferencia es: " + (p2-p1));

        }



    }
}