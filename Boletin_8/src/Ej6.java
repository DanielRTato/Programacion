/**
 * Dividir y juntar un String
 */
public class Ej6 {
    public static void main(String[] args) {

        String texto = "www. javadende0. com";
        char busca = 'a';

       int p =  texto.lastIndexOf(busca);

        String principio = texto.substring(0,p+1);
        String fin = texto.substring(p+1);
        System.out.println(principio);
        System.out.println(fin);
        System.out.println(principio + fin);


    }
}
