public  abstract class Mamifero  extends Animal{


    public Mamifero(String nome, int idade) {
        super(nome, idade);
    }

    public void mamar(){
        System.out.println(getNome() + " está mamando!");
    }
    public abstract String parir();


}
