public abstract class Animal {
    private String nome;
    private int idade;

    public Animal (String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }

    public void comer(){
        System.out.println(this.nome + "esta comendo");
    }

    public void durmir(){
        System.out.println(this.nome + "esta dormido");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade =Math.abs(idade);
    }

    public abstract  void  desprazar();






}

