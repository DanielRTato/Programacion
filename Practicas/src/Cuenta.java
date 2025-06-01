public class Cuenta {

    double balance;

    public Cuenta(double balance) {
        this.balance = balance;
    }

    public  void mostrarBalance() {
        System.out.println("Tu balance actual es: " + getBalance());
    }

    public void depositar (double cantidad) {
        if (cantidad > 0 ) {
            balance += cantidad;
        } else {
            System.out.println("La cantidad introducida no es valida");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            balance -= cantidad;
        } else {
            System.out.println("La cantidad introducida no es valida");

        }
    }



    public double getBalance() {
        return balance;
    }


}
