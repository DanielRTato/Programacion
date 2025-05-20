package colecciones;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class EjemploOrdenacion {
    public static void main(String[] args) {

        int[] intArray = new int[100];
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            intArray[i] = r.nextInt(1000);
        }
        //Arrays.sort(intArray,0,10);
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        Integer[] intArray2 = new Integer[100];
        for (int i = 0; i < 100; i++) {
            intArray2[i] = Integer.valueOf(intArray[i]);
        }
        Arrays.sort(intArray2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(intArray2));

    }
}
