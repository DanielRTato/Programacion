package Ej3;

public class Boletin9_3 {
    public static void main(String[] args) {

        Coche coche = new Coche();
        System.out.println(coche.getVelocidade());

        coche.acelerar(50);
        System.out.println(coche.getVelocidade());

        coche.frenar(20);
        System.out.println(coche.getVelocidade());


    }
}
