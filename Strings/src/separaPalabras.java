import java.util.Scanner;

/**
 * separa las palabras de un String
 */
public class separaPalabras {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //teclado.useDelimiter("\n");

        System.out.println("Introduce la frase");
        String texto = teclado.nextLine();

        String palabras[] = texto.split(" ");

        for (int i=0; i< palabras.length; i++){
            System.out.println(palabras[i]);
        }
    }
}
