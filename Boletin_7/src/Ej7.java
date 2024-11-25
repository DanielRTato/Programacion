import java.util.Arrays;

public class Ej7 {
    public static void main(String[] args) {
        //Codificar unha función que faga unha copia
        // dunha matríz pasado por parámetro e devolte
        // a copia do matríz.

        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("La lista original es"+ Arrays.toString(original));
        int[] clon = copia(original);
        System.out.println("El clon es: " + Arrays.toString(clon));
        for (int i=0; i<clon.length; i++){
            System.out.println(clon[i]);
        }
    }

    public static int[] copia(int[] lista) {
        int[] clon = new int[lista.length];

        for (int i = 0; i < lista.length; i++) {
            clon[i] = lista[i];
        }
        return clon;


    }
}