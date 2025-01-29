/**
 * Convirte String a mayusculas y de vuleta a minusculas
 */
public class Ej7 {
    public static void main(String[] args) {

        String texto = "javeros";
        if (texto == null || texto.isEmpty()) {
            System.out.println("El texto no puede ser nulo o vacío.");
            return;
        }

        System.out.println("Texto original: " + texto);

        String mayuscula = convertirMayusculas(texto);
        System.out.println("Texto  en mayúsculas : " + mayuscula);

        String minuscula = convertirMayusculas(texto);
        System.out.println("Texto  en minúsculas  : " + minuscula);



        }

    public static String convertirMayusculas (String texto){
        return texto.toUpperCase();
    }
    public static String convertirMinuscula (String texto){
        return texto.toLowerCase();
    }

}
