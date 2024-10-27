import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        short valor1; short valor2;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer numero:");
        valor1 = teclado.nextShort();
        System.out.print("Introduce el segundo:");
        valor2 = teclado.nextShort();

        if (valor1>=valor2) {
            System.out.println("La resta es: " + (valor1-valor2));
        }
        else {
            System.out.println("La suma es: " + (valor1+valor2));
        }




    }
}
