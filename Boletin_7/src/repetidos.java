import java.lang.reflect.Array;
import java.util.Arrays;

public class repetidos {
    public static void main(String[] args) {

        int[] repetidos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3};
        int[] sinRepe = repetidos;
        int [] ayuda = new int[1];
        for (int i = 0; i < repetidos.length; i++) {
            if (sinRepe[i] != repetidos[i]) {

            }
        }
        System.out.println(Arrays.toString(repetidos));
        System.out.println(Arrays.toString(sinRepe));

    }
}
