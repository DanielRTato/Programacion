public class Ej2 {
    public static void main(String[] args) {

        int [] notas = new int [30];
        int max = 11;

        for (int i =0; i<notas.length; i++){

            notas[i]= (int) (Math.random()*max);
            System.out.println(notas[i]);
            String resultado= (notas[i]>=5) ? "Aprobado": "Suspenso";
        }



    }
}
