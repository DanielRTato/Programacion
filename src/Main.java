public class Main {
    public static void main(String[] args) {

        String str = "hola pepe pepito pera";

        dosCararteres(str);
        inverso(str);
        tresUltimos(str);
        cadaDos(str);


    }

    /**
     *  Devulve las dos primeras letras de un String
     * @param str el string
     */
    public static void dosCararteres (String str){
        System.out.println(str.substring(0,2));
    }

    /**
     * imprime el String invertido
     * @param str
     */
    public static void inverso (String str){
        String invertido = new StringBuilder(str).reverse().toString();
        System.out.println(str);
        System.out.println(invertido);
    }

    /**
     * Imprime los 3 ultimos characterresFn
     * @param str
     */
    public static void tresUltimos (String str){
        String ultimosTres = str.substring(str.length() - 2);
        System.out.println(ultimosTres);
    }

    /**
     * Imprime saltandose una letra
     * @param str
     */
    public static void cadaDos (String str){
        for (int i=0; i<str.length();i+=2){
            System.out.println(str.charAt(i));

        }

    }

}