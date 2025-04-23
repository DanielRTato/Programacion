public class ExceptionEjemplo {
    public static void main(String[] args) {


        try {
            int myInt = Integer.parseInt("texto");

        }
        catch (NumberFormatException nfe) {
            System.out.println("Error, eso no es un número");
        }
        finally { // Siempre se ejecuta
            System.out.println("Esto siempre salta");
        }
    }
}
