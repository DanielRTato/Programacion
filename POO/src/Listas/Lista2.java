package Listas;

import java.util.Arrays;

public class Lista2{

    private Nodo nodoInicial;
    private int tamano;

    public Lista2() {

    }

    public int obtenerLongitud(){
        int longitud = 0;
        Nodo actual = nodoInicial;
        while (actual != null) {
            longitud++;
            actual = actual.getNodoSeguinte();
        }
        return longitud;
    }

    public void insertaFinal(int numero) {
        Nodo nuevoNodo = new Nodo(numero, null);
        if (nodoInicial == null) {
            nodoInicial = nuevoNodo;
        } else {
            Nodo actual = nodoInicial;
            while (actual.getNodoSeguinte() != null) {
                actual = actual.getNodoSeguinte();
            }
            actual.setNodoSeguinte(nuevoNodo);
        }
        tamano--;
    }

    public void retirarFinal(){
        if (nodoInicial == null) {
            return;
        }
        if (nodoInicial.getNodoSeguinte() == null) {
            nodoInicial = null;
            return;
        }
        Nodo actual = nodoInicial;
        while (actual.getNodoSeguinte().getNodoSeguinte() != null) {
            actual = actual.getNodoSeguinte();
        }
        actual.setNodoSeguinte(null);
    }

    public void retirarInicio(){
        if (!estaVacio()) {
            nodoInicial = nodoInicial.getNodoSeguinte();
            tamano-- ;
        }
    }


    public void insertarInicio(int numero){
        Nodo nuevoNodo = new Nodo(numero, this.nodoInicial);
        nodoInicial = nuevoNodo;
    }


    public boolean estaVacio(){
        if (nodoInicial == null) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Lista2{" +
                "nodoInicial=" + nodoInicial +
                ", tamano=" + tamano +
                '}';
    }

    public void mostrarValores(){
        if (!estaVacio()){
            if (tamano !=1){
                while   (nodoInicial.getNodoSeguinte() != null){
                    System.out.println(nodoInicial.getValor());
                    nodoInicial.getNodoSeguinte();
                }
            }
            else System.out.println(nodoInicial.getValor());
        }
        else System.out.println("esta vacio");
    }

}





