public class Can extends Mamifero {


    public Can(String nome, int idade, String raza, boolean manchas) {
        super(nome, idade);

    }

    @Override
    public void desprazar() {
        System.out.println("Corre a 4 patas");
    }


}
