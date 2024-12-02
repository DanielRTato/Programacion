import java.math.BigInteger;
/**
 * Un programa que calcule a suma e o produto dos números comprendidos entre 10 e 90.
 * @author Daniel Rodríguez Tato
 * @version 1.0
 */
public class Ej2 {
    public static void main(String[] args) {

        int inicio = 10;
        int fin = 90;
        long  suma = 0;
        BigInteger producto= BigInteger.ONE; // Utilizo BigInteger en lugar de long para que entre el producto.

        for (int i = inicio; i <= fin; i++) {
            suma += i;
            producto = producto.multiply(BigInteger.valueOf(i));
        }

        System.out.println("La suma de los números es: " + suma);
        System.out.println("El producto de los números entre es: " + producto);
    }
}
