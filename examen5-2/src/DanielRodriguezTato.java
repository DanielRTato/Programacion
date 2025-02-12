/**
 * Ejercicios del examen del 5/2/25
 * @author Daniel Rodriguez Tato
 */
public class DanielRodriguezTato {
    public static void main(String[] args) {

        String texto = "open systems interconnection";
        System.out.println("El texto original es : " + texto);

        StringBuilder siglas =sigla(texto);
        System.out.println("El acrónimo es :  " + siglas);

        String invertido = inverso(texto);
        System.out.println("El texto invertido es " + invertido);


    }

    /**
     * Recibe un String y devuelve sus siglas
     * @param texto el String a convertir en siglas
     * @return las siglas
     */
    public static StringBuilder sigla(String texto) {

        StringBuilder siglas = new StringBuilder();
        siglas.append(texto.charAt(0));
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isWhitespace(c)) {
                i++;
                siglas.append(texto.charAt(i));
            }

        }
        siglas = new StringBuilder(siglas.toString().toUpperCase());
        return siglas;
    }

    /**
     * Recibe un String y lo devuelve del reves
     * @param texto el String original
     * @return un String invertido
     */
    public static String inverso (String texto) {

        String invertido = new StringBuilder(texto).reverse().toString();

        return invertido;
    }
}