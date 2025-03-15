package disenioclases;

public class Rectangulo {

    private final int COORD_X = 0;
    private final int COORD_Y = 0;

    private double[] c1,c2,c3,c4;

    public Rectangulo(){
        c1 = new double[2];
        c2 = new double[2];
        c3 = new double[2];
        c4 = new double[2];
    }

    public Rectangulo(double[] c1, double[] c2, double[] c3, double[] c4) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
    }

    public double base(){
        return Math.abs(c1[COORD_X] - c2[COORD_X]);
    }
    public double altura(){
        return Math.abs(c1[COORD_Y] - c3[COORD_Y]);
    }

    public void dibujar (char c){
        int base = (int) Math.round(base());
        int alura = (int) Math.round(altura());

        String pintura = "" + c;

        System.out.println(pintura.repeat(base));

        if (alura > 2){
            for (int i = 0; i < alura - 2; i++) {
                System.out.print(pintura);
                if (base > 2){
                    System.out.print(" ".repeat(base - 2));
                }
                System.out.println(pintura);
            }
        }

        System.out.println(pintura.repeat(base));

    }

}
