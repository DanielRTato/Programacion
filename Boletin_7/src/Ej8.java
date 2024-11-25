import java.util.Arrays;

public class Ej8 {
    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("La lista original es"+ Arrays.toString(original));
        int[] clon = copia(original);
        System.out.println("El clon es: " + Arrays.toString(clon));
    }

    public static int[] copia(int[] lista) {

        int x=0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]%2==0){
                x++;
            }
        }
        int c=0;
        int [] clon = new int[x];
        for (int i=0; i<lista.length; i++){
            if (lista[i] % 2 == 0) {
                clon[c] = lista[i];
                c++;
            }


    }return clon;

    }

}

