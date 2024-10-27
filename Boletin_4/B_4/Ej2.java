import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        double pi = 3.14; double radio;  int base; int altura; int lado;

        Scanner teclado = new Scanner(System.in);
        System.out.println("1-Cuadrado 2-Triangulo 3-Circulo \nElige una figura");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1-> {
                System.out.print("Lado:");
                lado = teclado.nextInt();
                System.out.print("El area es: " + lado*lado);
            }
            case 2-> {
                System.out.print("Base:");
                base = teclado.nextInt();
                System.out.print("Altura:");
                altura = teclado.nextInt();
                System.out.println("El area es: " + (base*altura/2));
            }
            case 3-> {
                System.out.print("Radio:");
                radio = teclado.nextDouble();
                System.out.println("El area es: " + (pi *(radio*radio)));
            }
        }















    }
}
