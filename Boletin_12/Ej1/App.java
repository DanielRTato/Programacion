package Ej1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1- ");
            System.out.println("2- ");
            System.out.println("3- ");
            System.out.println("4- ");
            System.out.println("0- Salir");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1 ->
                case 2 ->
                case 3 ->
                case 4 ->
                default -> System.out.println("Opcion no valida");
            }
        } while (opcion != 0);


    }
}
