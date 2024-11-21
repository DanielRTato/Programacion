import  java.util.Scanner;

public class Ej5 {
    //una funcion que reciba dos parametros, una tabla y un valor y
    // que busyqe dentro de la tabla si existe ese valor, si exise que dveulva el indece y si no -1

     static int buscarValor(int[]lista, int n) {

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == n) {
                return i;
            }


        }
        return -1;
    }

        public static void main (String[]args){

            int[] lista = {2, 3, 4, 5, 6, 7, 8};
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce el número a buscar");
           int n = teclado.nextInt();
           int lis= buscarValor(lista,n);
          System.out.println(lis);
        }

    }