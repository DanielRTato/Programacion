import java.util.Scanner;

public class Ej6 {

    static int buscarValor(int[]lista, int n) {

        int inicio = 0;
        int fin = lista.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (lista[medio] == n) {
                return medio;
            } else if (n < lista[medio]) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] lista = {1,2, 3, 4, 5, 6, 7, 8,9,10};
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número a buscar");
        int n = teclado.nextInt();
        int lis= buscarValor(lista,n);

        System.out.println(lis);
    }
}
