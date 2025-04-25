import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static void peditDatos() throws InputMismatchException {
        try {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        String nombreUsuario = teclado.nextLine();

        System.out.println("Introduce tu edad");
        int edad = teclado.nextInt();

        System.out.println("Hola " + nombreUsuario + " . El año que viene tendrás " + (edad+1) + " años.");
            }catch (InputMismatchException e){
            System.out.println("Edad no valida");
        }
    }

    public static void main(String[] args) {

    peditDatos();

    }
}