/**
 * Cuenta la cantidad de letras numeros y espacios en blanco
 */
public class Ej11 {
    public static void main(String[] args) {

        String texto = "Ola, son alumno de DAM1, e son programador desde o 2024";

        contar(texto);

    }

    public static void  contar(String texto) {
        int letras = 0;
        int numeros = 0;
        int espacios = 0;
        int otro = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);


            if (Character.isLetter(caracter)) {
                letras++;
            } else if (Character.isDigit(caracter)) {
                numeros++;
            } else if (Character.isWhitespace(caracter)) {
                espacios++;
            } else {
                otro++; // Caracteres especiais
            }
            System.out.println("Letras: " + letras);
            System.out.println("Numeros: " + numeros);
            System.out.println("Espacios: " + espacios);
            System.out.println("Otros: " + otro);
        }


    }}




