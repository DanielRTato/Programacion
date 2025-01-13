import java.util.Scanner;
public class ahorcado {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String respuesta = "caracol";

        pista(respuesta);
        letra(teclado);


    }

    public static String pista(String respuesta) {

        return "_ ".repeat(respuesta.length()).trim();
    }

    public static String letra (Scanner teclado){
        System.out.println("Introduce una letra");
        return teclado.next();
    }

    public static String most(String respuesta, String pista, String letra) {
        StringBuilder nuevaPista = new StringBuilder(pista.replace(" ", ""));
        for (int i = 0; i < respuesta.length(); i++) {
            if (respuesta.charAt(i) == letra.charAt(0)) {
                nuevaPista.setCharAt(i, letra.charAt(0));
            }
        }
        return nuevaPista.toString().replace("", " ").trim();
    }
}










