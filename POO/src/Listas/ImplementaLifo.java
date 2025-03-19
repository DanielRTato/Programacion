package Listas;

public class ImplementaLifo extends Lista2 implements  Lifo{

    public ImplementaLifo(){
        super();
    }

    public void apilar(int novoNum) {
        insertaFinal(novoNum);
    }

    @Override
    public int desapilar() {
        getNodo()
    }
}
