package Listas;

public class Nodo {
    private int valor;
    private Nodo nodoSeguinte;

    public Nodo(int valor, Nodo nSeguinte) {
        this.valor = valor;
        this.nodoSeguinte = nSeguinte;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getNodoSeguinte() {
        return nodoSeguinte;
    }

    public void setNodoSeguinte(Nodo nodoSeguinte) {
        this.nodoSeguinte = nodoSeguinte;
    }
}
