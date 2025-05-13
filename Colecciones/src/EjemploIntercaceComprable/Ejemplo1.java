package EjemploIntercaceComprable;

public class Ejemplo1 {
    public static void main(String[] args) {

        String s1 = "ABC";
        String s2 = "CDE";

        int resultado = s1.compareTo(s2);

        if (resultado < 0) System.out.println("s1 es menor que s2");
            else if (resultado==0) System.out.println("Son iguales");
            else System.out.println("s1 es mayor que s2");



    }
}
