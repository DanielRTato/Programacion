/**
 * Cuenta vocales y consonantes
 */
public class Ej5 {
    public static void main(String[] args) {

        String texto = "java java java";
        int     vocales = 0;
        int consonantes = 0;

        for (char i : texto.toCharArray()) {
            if (Character.isLetter(i)){
                if ("aeiou".indexOf(i) != -1){
                    vocales ++;
                }else{
                    consonantes ++;
                }
            }
        }
        System.out.println("Tiene " +consonantes+ " consonantes y "+vocales +" vocales");
    }
}