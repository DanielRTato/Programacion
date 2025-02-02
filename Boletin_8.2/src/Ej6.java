package src;

public class Ej6 {
    public static void main(String[] args) {

        String texto ="algoritmos";

        System.out.println(consonate(texto));
        System.out.println(vocales(texto));
        System.out.println(siguienteVocal(texto));

    }

    /**
     *  Elimina las vocales de un texto
     * @param texto mete un String
     * @return el String sin vocales
     */
    public static String consonate (String texto){

        return texto.replaceAll("[aeiouAEIOU]","");
    }

    /**
     * Elimina las consonantes de un String
     * @param texto
     * @return
     */
    public static String vocales (String texto){
        return texto.replaceAll("[^aeiouAEIOU]","");
    }

    /**
     * Cambia un vocal por la siguiente
     * @param texto
     * @return
     */
    public static String siguienteVocal (String texto){

        StringBuilder resultado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            switch (c) {
                case 'a': resultado.append('e'); break;
                case 'e': resultado.append('i'); break;
                case 'i': resultado.append('o'); break;
                case 'o': resultado.append('u'); break;
                case 'u': resultado.append('a'); break;
                default: resultado.append(c);
            }
        }
        return resultado.toString();
    }
}
