package src;

public class Ej5 {
    public static void main(String[] args) {

        String texto = "universal serial bus";

        siglas(texto);


    }

    /**
     * Imprime las siglas
     * @param texto
     */
    public static void  siglas (String texto){
        StringBuilder siglas = new StringBuilder();
        siglas.append(texto.charAt(0));
        for (int i =0; i<texto.length();i++){
            char c = texto.charAt(i);
            if (Character.isWhitespace(c)){
                i++;
                siglas.append(texto.charAt(i));
            }
        }
        System.out.println(siglas.toString().toUpperCase());
    }

    public static void mayuscula (String texto){

    }

}
