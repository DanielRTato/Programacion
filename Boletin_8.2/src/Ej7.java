package src;

public class Ej7 {
    public static void main(String[] args) {

        String cadea = "cadea";
        String subcadea = "subcadea";
        String texto = "eee";
        String texto1 = "aaa";

        System.out.println(compruebaCadenas(cadea,subcadea)? "Es subcadena" : "No es subcadena");
        System.out.println("La primera es " + ordenAlfabetico(texto,texto1));

    }

    /**
     * Comprueba si un String esta dentro de otro
     * @param cadea
     * @param subcadea
     * @return true si pertece a otro String o false si no
     */
    public static boolean compruebaCadenas ( String cadea, String subcadea){
        return subcadea.contains(cadea);
    }

    /**
     * Devuelve el primer String
     * @param texto
     * @param texto1
     * @return
     */
    public static String ordenAlfabetico (String texto, String texto1){

        int compara = texto.compareTo(texto1);
        if (compara<0){
            return texto;
        }else {
            return texto1;
        }
    }
}

