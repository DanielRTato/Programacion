package Listas;

public class Pila extends Lista2 implements Cola{

    public Pila(){
        super();
    }



    @Override
    public void encolar(int novoValor) {

    }

    @Override
    public int desencolar() {
        if (estaVacio()) {
            return -1;
        }
        int valor = getNodo(0);
        retirarInicio();
        return valor;
    }

}
