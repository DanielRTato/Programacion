/**
 * Sustituye vocales
 */
public class Ej9 {
    public static void main(String[] args) {

        String texto = " Jeve jeve jeve";

        System.out.println("El texto original :" + texto);

        cambiar(texto);


    }
    public static void cambiar (String texto){
        String textoa = texto.replace('e','a');

        System.out.println("El texto modificado : " + textoa);

    }
}
