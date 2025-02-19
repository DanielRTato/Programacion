public class ContaCorrente {
    private String nome;
    private String nif;
    private double saldo;
    private String numeroConta;
    private static int cintadorContas;

    public ContaCorrente (String nome, String nif, double saldo, String numeroConta){
        this.nome = nome;
        setNif(nif);
        setSaldo(saldo);
        this.numeroConta = numeroConta;
        cintadorContas ++;
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
        char letraNif[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        if (nif.length()==9 && Character.isLetter(nif.charAt(8))){
            if (nif.charAt(8) == letraNif[Integer.parseInt(nif.substring(0,8))%23]){ //o usar getInteger
                this.nif = nif;
            }
            else{ throw new RuntimeException("NIF invalido");}
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
