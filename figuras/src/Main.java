 public class Main {
    public static void main(String[] args) {

        System.out.println("Hola dbz");
        Personaje personaje1 = new Personaje();
        Personaje personaje2 = new Personaje("Goku");
        System.out.println("Hola " + personaje1.nombre);
        System.out.println("Este es " + personaje2.nombre);

    try {
        Punto p1 = new Punto(15,12);
        Punto p2 = new Punto (15,2);
        System.out.println(p1.equals(p2));
        System.out.println(p1);
        Circulo c1 = new Circulo(5,4,3);
        System.out.println(c1.toString());
        System.out.println("Coordenda x de c1: " + c1.getX());
        System.out.println("Coordenada y de c1: " + c1+ c1.getY());

        Cilindro cil1 = new Cilindro(2,3,4,5); //volumen del cilindro
        System.out.println(cil1.toString());

        Prisma pri1 = new Prisma(2,3,4,5);
        System.out.println(pri1);
    }catch (ExcepcionPuntoForaPrimeiroCadrante erro){
        System.out.println("No se puede crear el punto");
    }





/*
        int dano = personaje1.perderVida(1000);
        System.out.println("Vidas restantes de "+ personaje1.nombre + " " + dano);

         dano = personaje1.perderVida(10);
        System.out.println("Vidas restantes de "+ personaje1.nombre + " " + dano);

        Personaje personaje3 = new Personaje("Krilirin");
        personaje3.setVida(1000);
        dano = -5;
        int respuestaEsperada = 1000;
        int vidaRestante = personaje3.perderVida(dano);
        if (vidaRestante== respuestaEsperada){
            System.out.println("Ok");
        }else System.out.println("Fallo");
*/






    }
}