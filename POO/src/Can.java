public class Can extends Mamifero implements Son {


    String tipoSon;
    public Can(String nome, int idade, String tipoSon) {
        super(nome, idade);
        this.tipoSon = tipoSon;

    }

    @Override
    public void desprazar() {
        System.out.println("Corre a 4 patas");
    }

    public String parir(){
        return "Bebe";
    }

    @Override
    public void voz() {
        System.out.println("Ehiiaaaaa!");
    }
}
