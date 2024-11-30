import java.util.Scanner;

/**
 * @author Danielr
 */
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int puntuacion = 0;
        String [] respuesta ={"", "", ""};
        String [] correcta ={"c","a","d"};

        System.out.println("¿En qué ciudad estarías si te encontraras en las escaleras de la Plaza de España? Roma?");
        System.out.println("a) Sevilla");
        System.out.println("b) Madrid");
        System.out.println("c) Roma)");
        System.out.println("d) Ciudad de México");

        System.out.println("¿Cuántos minutos tiene una semana?");
        System.out.println("a) 10080");
        System.out.println("b) 120620");
        System.out.println("c) 980)");
        System.out.println("d) 9650");

        System.out.println("¿Cuántos elementos contiene la tabla periódica?");
        System.out.println("a) 80");
        System.out.println("b) 102");
        System.out.println("c) 236)");
        System.out.println("d) 118");

       respuesta[0] = scan.next();
       respuesta[1] = scan.next();
       respuesta[2] = scan.next();

       for (int i = 0; i<3; i++){
           if (respuesta[i].equalsIgnoreCase(correcta[i])){
               puntuacion++;
           }
       }
        System.out.println("Puntuacion: "+puntuacion+" /3");


    }
}