/**
 * Calcula a cantidade de números negativos, positivos e ceros que hai nun grupo de 10 números enteiros.
 * @ Daniel Rodríguez Tato
 * @version 1.0
 */
public class Ej1 {
    public static void main(String[] args) {

        int [] numeros;
        int positivos = 0; // Contador de números positivos
        int negativos = 0;  // Contador de números negativos
        int ceros = 0;      // Contador de ceros
        numeros = new int[]{0,0,1,5,-1,-7,34,0,-134,0}; //Array que almacena los numeros

        // Recorre el array y cuenta cada tipo de número
        for (int numero : numeros) {
            if (numero > 0) {
                positivos++;
            }
            else if (numero == 0) {
                ceros++;
            }
            else  {
                negativos++;
            }
        }

        // Imprimir los resltados
        System.out.println("La cantidad de numeros negativos es: " +negativos);
        System.out.println("La cantidad de numeros positovs es: " +positivos);
        System.out.println("La cantidad de ceros es: " +ceros);

    }
}