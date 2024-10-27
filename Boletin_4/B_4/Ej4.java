/**
 * Introduce un mumero del 0 al 99 y de dice como se escribe
 * @author DanielRT
 * @version 1.0
 */

import java.util.Scanner;


public class Ej4 {
    public static void main(String[] args) {

        //declaramos las variables y el Scanner
        int numero;
        String decena="", unidade="", conjuncion = "", espazo="";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        numero = teclado.nextInt();
        int decenas, unidades;

        //calculamos las decenas y unidades por separado
        decenas = numero/10;
        unidades = numero %10;

        //Como se escribem ñas decemas por separado
        switch (decenas){
            case 1: if (unidades==1) unidade = "Once";
            else if (unidades==2) unidade = "Doce";
            else if (unidades==3) unidade = "Trece";
            else if (unidades==4) unidade = "Catorce";
            else if (unidades==5) unidade = "Quince";
            else if (unidades==6) unidade = "Dieciseis";
            else if (unidades==7) unidade = "Diecisite";
            else if (unidades==8) unidade = "Dieciocho";
            else if (unidades==9) unidade = "Diecinueve";
            else if (unidades==0) unidade ="Diez";
            case 2: decena = "veinte"; break;
            case 3: decena = "trenta"; break;
            case 4: decena = "cuarenta";break;
            case 5: decena = "cincuenta";break;
            case 6: decena = "sesenta"; break;
            case 7: decena = "setenta"; break;
            case 8: decena = "ochenta"; break;
            case 9: decena = "noventa"; break;
        }
        // Como se escriben las unidades por separado
        switch (unidades){
            case 0: unidade = ""; break;
            case 1: unidade = "uno"; break;
            case 2: unidade = "dos"; break;
            case 3: unidade = "tres"; break;
            case 4: unidade = "cuatro"; break;
            case 5: unidade = "cinco"; break;
            case 6: unidade = "seis"; break;
            case 7: unidade = "siete"; break;
            case 8: unidade = "ocho"; break;
            case 9: unidade = "nueve"; break;
        }
        conjuncion= (unidades==0|| decenas==0 || decenas==1)? "": "y ";
        System.out.println("El numero es: " + decena + " "+ conjuncion + unidade);







    }
}