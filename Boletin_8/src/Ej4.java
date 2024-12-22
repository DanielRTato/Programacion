/**
 * Imprime un texto sin espacios de dos formas
 */
public class Ej4 {
    public static void main(String[] args) {

        String str = "James Gosling Created Java";
        char espacio = ' ';

        // Primer metodo
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) != espacio){
                System.out.println(str.charAt(i));
            }
        }

        // Segundo metodo
         String sinEspacio = str.replace(" ", "");
        System.out.println(sinEspacio);



    }
}
