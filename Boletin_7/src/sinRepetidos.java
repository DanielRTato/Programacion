import java.util.Arrays;

public class sinRepetidos {
    public static void main(String[] args) {
        int[] repetidos = {1, 9,2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3};
        int[] temporal = new int[1];
        for (int elemento : repetidos) {
            if (Ej5.buscarValor(temporal, elemento) == -1) {
                int[] novo = new int[temporal.length + 1];
                for (int i = 0; i < temporal.length; i++) {
                    novo[i] = temporal[i];
                }
                novo[temporal.length] = elemento;
                temporal = novo;
            }
            System.out.println(Arrays.toString(temporal));
        }
    }
}