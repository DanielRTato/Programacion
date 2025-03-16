package Ej4;

public class App {
    public static void main(String[] args) {

        Conta conta1 = new Conta("Pepe", "123456789", 1.5, 1000);
        //conta1.amosar();
        System.out.println("Saldo conta1 : " + conta1.getSaldo());

        conta1.ingreso(500);
        //conta1.amosar();
        System.out.println("Saldo conta1 : " + conta1.getSaldo());

        conta1.reintegro(200);
        //conta1.amosar();
        System.out.println("Saldo conta1 : " + conta1.getSaldo());

        Conta conta2 = new Conta("Juan", "987654321", 2.5, 2000);
        System.out.println("Saldo conta2 : " + conta2.getSaldo());

        conta1.transferencia(conta2, 300);
        System.out.println("Saldo conta1 : " + conta1.getSaldo());
        System.out.println("Saldo conta2 : " + conta2.getSaldo());


    }
}
