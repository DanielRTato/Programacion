public class Conta {
    private String nomeCliente;
    private String numConta;
    private double interes;
    private double saldo;

    // contructor por defecto
    public Conta (){
        this.nomeCliente = "";
        this.numConta = "";
        this.interes = 0.0;
        this.saldo = 0.0;
    }

    // contructor con todolos parametros
    public Conta (String nomeCliente, String numConta, double interes, double saldo){
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.interes = interes;
        this.saldo = saldo;
    }

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

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingreso() {

    }
}
