package Ej1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("ELIGE UNA OPCION");
            System.out.println("1- Engadir novo cliente");
            System.out.println("2- Mostras clientes");
            System.out.println("3- ");
            System.out.println("4- ");
            System.out.println("0- Salir");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1 -> Cliente.engadirCliente(teclado);
              case 2 -> Cliente.mostrarCliente();
//                case 3 ->
//                case 4 ->
                default -> System.out.println("Opcion no valida");
            }
        } while (opcion != 0);

        Cliente.guardarDatos();

    }
}
