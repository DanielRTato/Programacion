package Ej2;

public class App {
    public static void main(String[] args) {

        Consumo consume  = new Consumo();

        consume.setLitros(50);
        consume.setPGas(1.57f);

        System.out.println("---------------------");
        Consumo consume1 = new Consumo(120,50,50,1.70f);

        System.out.println(consume1.consumoMedio());
        consume1.setLitros(60);
        System.out.println(consume1.getvMedvelocidade());


        System.out.println("---------------------");

    }
}
