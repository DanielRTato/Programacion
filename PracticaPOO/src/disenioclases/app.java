package disenioclases;

public class app {
    public static void main(String[] args) {

        double[] p1 = new double[]{0,0};
        double[] p2 = new double[]{10,0};
        double[] p3 = new double[]{10,10};
        double[] p4 = new double[]{0,10};

        Rectangulo r1 = new Rectangulo(p1,p2,p3,p4);

        r1.dibujar('*');

    }
}
