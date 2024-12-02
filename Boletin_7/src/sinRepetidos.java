import java.util.Arrays;

/**
 *
 */
public class sinRepetidos {
    public static void main(String[] args) {
        int[] repetidos = {1, 9,2, 3, 4, 5,9,6, 6, 7, 8, 9, 1, 2, 3};
        int[] sinRepetidos = new int[0];
        for (int elemento : repetidos) {
            if (Ej5.buscarValor(sinRepetidos, elemento) == -1) {
                                int[] novo = new int[sinRepetidos.length + 1];
                for (int i = 0; i < sinRepetidos.length; i++) {
                    novo[i] = sinRepetidos[i];
                }
                novo[sinRepetidos.length] = elemento;
                sinRepetidos = novo;
            }
            System.out.println(Arrays.toString(sinRepetidos));
        }
        System.out.println("La tabla final es: " + Arrays.toString(sinRepetidos));
    }
}