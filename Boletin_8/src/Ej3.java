/**
 * Dos formas de invertir el contenido de un String
 */
public class Ej3 {
    public static void main(String[] args) {

        String str = "Java desde 0";

        for (int i=str.length()-1; i>=0; i--){
            System.out.println(str.charAt(i));
        }

        String invertido = new StringBuilder(str).reverse().toString();
        System.out.println(invertido);

    }
}
