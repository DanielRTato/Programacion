import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un valor numerico:");
        int numero = teclado.nextInt();

        int absoluto = (numero<=-1) ? -numero:numero;
        System.out.println("El valor absoluto es: "  + absoluto);







    }
}
