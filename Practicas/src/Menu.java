import java.util.Scanner;

public class Menu {


    public static void Menu() {
        boolean isRunning = true;
        Scanner teclado = new Scanner(System.in);
        int opcion;
        double cantidad = 0;
        Cuenta cuenta = new Cuenta(0);

        while (isRunning) {
            System.out.println("PROGRAMA BANCARIO");
            System.out.println("--------------------");
            System.out.println("1. Balance");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Salir");
            System.out.println("--------------------");
            System.out.println("Elige una opcion (1 al 4)");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> cuenta.mostrarBalance();
                case 2 -> {
                    System.out.println("Cuanto deseas depositar?");
                        cantidad = teclado.nextDouble();
                    cuenta.depositar(cantidad);
                }
                case 3 -> {
                    System.out.println("Cuanto deseas retirar?");
                    cantidad = teclado.nextDouble();
                    cuenta.retirar(cantidad);
                }
                case 4 -> {
                    System.out.println("Saliendo... ");
                    isRunning = false;
                }
                default -> System.out.println("Opcion no valida");
            }

        }
        teclado.close();
    }
}