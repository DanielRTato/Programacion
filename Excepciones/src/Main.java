import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static void peditDatos() throws InputMismatchException { // Podria camputar Expection si no sé cual es la concreta
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

        Scanner teclado = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Elige una opcion");
            System.out.println("1. Introducir datos");
            System.out.println("2. Salir del programa");
            opcion = teclado.nextInt();

            if (opcion==1) {
                peditDatos();
            } else if (opcion !=2) {
                System.out.println("Opcion no valida");

            }
        }
        while (opcion != 2); {
            System.out.println("Saliendo del programa...");



        }
}}