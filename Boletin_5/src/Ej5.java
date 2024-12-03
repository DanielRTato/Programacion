import java.util.Scanner;
/**
 *  Codifica un programa que lea o soldo de cada un dos
 *  traballadores dunha empresa e obteña o número deles que ganan
 *  entre 1000 e 1750 €, ámbolos dous incluídos e, a porcentaxe de traballadores
 *  que ganan menos de 1000 €. Tendo en conta que non se coñece con antelación o
 *  numero de traballadores da empresa e non se admiten os soldos negativos
 *  (utiliza como condición de fin un soldo 0).
 */
public class Ej5 {
    public static void main(String[] args) {

        int sueldoJusto= 0;
        int sueldoMenor= 0;
        double porcentaje = 0;
        int totalTrabajadores = 0;
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Introduce el sueldo del empleado");
            int sueldo = scan.nextInt();

            if (sueldo==0){
                break;
            } else if (sueldo<0) {
                System.out.println("Error, introduce otra cantidad");
            }
            totalTrabajadores++;

            if (sueldo>=1000 && sueldo<=1750){
                sueldoJusto++;
            }
            if (sueldo<1000) {
                sueldoMenor++;
            }
        }
        double porcentaxe = (sueldoMenor*100.0)/totalTrabajadores;
        System.out.println("La cantidad de empleados que cobran entre 1000 y 1750€ es: " +sueldoJusto);
        System.out.println("El porcentaje de trabajadores que cobran menos de 1000€ es: " + porcentaxe);
    }
}
