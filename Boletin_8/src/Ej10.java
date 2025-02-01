/**
 * Cambiar caracter a ASCII
 */
public class Ej10 {
    public static void main(String[] args) {

        String texto = "ABCD";

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            int ascii = (int) caracter;
            System.out.println( caracter +" es " + ascii);

        }

    }
}
