public class Canguro extends Mamifero implements Comunicacion{

    public Canguro(String nome, int edade){
        super(nome,edade);
    }
    public String parir(){
        return "Un canguriño";
    }

    public void desprazar (){
        System.out.println("Salta");
    }

    public void ronroneo(){
        System.out.println("ehhhh");
    }

    public void voz(){
        System.out.println("Wiiii");
    }


}

