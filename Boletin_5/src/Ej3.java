import java.util.Scanner;
/**
 *  Deseña un programa que calcule o área dun rectángulo
 *  cuxa base e altura pides por teclado. Asegúrate que estes valores sexan positivos,
 *  para eso valida os datos.
 * @author Daniel Rodríguez Tato
 * @version 1.0
 */
public class Ej3 {
    public static void main(String[] args) {

        int base;
        int altura;
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce la base del rectangulo");
        System.out.println("Introduce la altura");
        base = scan.nextInt();
        altura = scan.nextInt();


        while (base>=0 && altura>=0){
            System.out.println("EL resultado es: " + base*altura);
            break;
        }
        scan.close();
    }
}
