public class ContaCorrente {
    private String nome;
    private String nif;
    private double saldo;
    private String numeroConta;

    public ContaCorrente (String nome, String nif, double saldo, String numeroConta){
        this.nome = nome;
        this.nif = nif;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        if (nif.length()==9 && Character.isLetter(nif.charAt(8))){
            this.nif = nif;
        }
        else{ throw new RuntimeException("NIF invalido");}
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public boolean SacarDinero(double cantidad){
        if (cantidad>saldo){
            return false;
        }
        else{
            saldo -= cantidad;
            return true;
        }
    }

    public boolean ingresarDinero (double cantidad){
        if (cantidad<0){
            return false;
        }
        else{
            saldo += cantidad;
            return true;
        }
    }

    public String mostrarInformacion(){
        return "El dueño de la cuenta es " + nome + "con dni " + nif + "tiene un saldo de " + saldo + " en la cuenta " + numeroConta;
    }



}
