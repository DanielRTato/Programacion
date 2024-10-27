import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        int productos;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cantidad");
        productos= teclado.nextInt();

        if (productos <= 100){
            System.out.println("baixo");
        }
        if (productos >100 && productos<500){
            System.out.println("medio");
        }
        if (productos >500 && productos<=100){
            System.out.println("Alto");
        }
        else {
            System.out.println("Primeira necesidade");
        }



    }
}