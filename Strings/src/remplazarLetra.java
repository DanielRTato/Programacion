import java.util.Scanner;

/**
 * remplaza una letra por otra
 */
public class remplazarLetra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");

        System.out.println("Introduce la frase");
        String texto = teclado.next();

        texto = texto.replace('a', 'e');
        texto = texto.replace('i', 'o');

        System.out.println(texto);
    }
}
