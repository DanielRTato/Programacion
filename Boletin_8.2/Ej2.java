public class Ej2 {
    public static void main(String[] args) {

        String mancha = "en un lugar de la mancha 111";
        String coma = ",";

        coma(mancha,coma);
        espazos(mancha);
        System.out.println(digitos(mancha));

    }
    public static void  coma (String mancha, String coma){
        System.out.println( String.join(String.valueOf(coma), mancha.split("")));
    }
    public static void espazos (String mancha){
        System.out.println(mancha.replace(" ", "/_"));
    }

    public static String digitos(String mancha) {
        char x = 'X';
        StringBuilder nuevaMancha = new StringBuilder(mancha);
        for (int i = 0; i < mancha.length(); i++) {
            if (Character.isDigit(mancha.charAt(i))) {
                nuevaMancha.setCharAt(i, x);
            }
        }
        return nuevaMancha.toString();
    }




}
