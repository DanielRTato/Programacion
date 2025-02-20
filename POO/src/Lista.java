import java.lang.reflect.Array;
import java.util.Arrays;

/*
taboa de ints
constructor con taboa con 0 elementos
obter numero de elementos
insertar  numero ao final da lista
insertar numero ao principio
insertar en un lugar de la lista especificado por un indice
obter un elemento especificado por un indice
buscar un numero na lista, devoltando o indice do primeiro lugar
    onde se econtre, devolverá -1 si non o encontra.
mostra elementos da lista por consola
 */
public class Lista {
    private int[] tabla;

    public Lista() {
        this.tabla = new int [0];
    }

    public int obtenerLongitud(){
        return tabla.length;
    }

    public void insertaFinal(int numero){
        tabla = Arrays.copyOf(tabla, tabla.length +1);
        tabla[tabla.length -1] = numero;
    }





}
