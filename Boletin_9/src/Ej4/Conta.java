package Ej4;

public class Conta {

    private String nomeCliente;
    private String numConta;
    private double tipoInteres;
    private double saldo;

    // Constructor por defecto
    public Conta() {
        this.nomeCliente = "";
        this.numConta = "";
        this.tipoInteres = 0.0;
        this.saldo = 0.0;
    }

    // Constructor con todos los parámetros
    public Conta(String nomeCliente, String numConta, double tipoInteres, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    // Getters y Setters
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Metodos
    public void ingreso (double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void reintegro (double cantidad) {
        if (cantidad > 0) {
            saldo -= cantidad;
        }
    }

    public void transferencia (Conta c, double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            c.saldo += cantidad;
        }
    }

    public void amosar() {
        System.out.println("Nome cliente: " + nomeCliente + "\nNúmero de conta: " + numConta + "\nTipo de interés: " + tipoInteres + "\nSaldo: " + saldo);
    }

}
