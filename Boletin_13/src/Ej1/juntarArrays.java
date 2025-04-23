package Ej1;

import java.util.Arrays;

public class juntarArrays <T> {

    private T[] array1;
    private  T[] array2;

    public juntarArrays(T[] array1, T[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public T[] concatenar() {
        T[] resultado = Arrays.copyOf(array1, array1.length + array2.length);
        for (int i = 0; i < array2.length; i++) {
            resultado[array1.length + i] = array2[i];
        }
        return resultado;
    }

    }

