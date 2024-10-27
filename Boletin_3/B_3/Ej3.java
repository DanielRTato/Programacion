import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        int  x;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        x = entradaTeclado.nextInt();

        if (x >  0) {   // si el numero es mayor a 0
            System.out.println("+");
        }

        else if (x == 0){    // si es igual a 0
            System.out.println("0");
        }

        else{       //si es menos a 0
            System.out.println("-");
        }






    }
}
