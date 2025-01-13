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

    public static void  most (String respuesta){
        for ( int i = 0; i<respuesta.length(); i++){
            System.out.println(respuesta.replace(respuesta.charAt(i),"_"));
        }
    }

}






