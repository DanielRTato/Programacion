public class Ej1 {
    public static void main(String[] args) {

        int [] numeros = new int [6];
        int max = 51;
        System.out.println("El orden normal es:");
        for (int i =0; i<numeros.length; i++){

            numeros[i]= (int) (Math.random()*max);
            System.out.println(numeros[i]);
        }
        System.out.println("El orden a la inversa es: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);

    }
}}