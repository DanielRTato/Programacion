import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int n1 = teclado.nextInt();
        System.out.println("Introduce el segundo número");
        int n2 = teclado.nextInt();
        System.out.println(comprendidos(n1,n2));
    }
    public static int comprendidos(int a, int b){
        for (int i=1;a!=b;a--){
            System.out.println(a); //aa
        }
    return a;
    }
}