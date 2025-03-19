public class Ej5 {
    public static void main(String[] args) {
        // a)
        int i = 1, j = 0, k = 1;
        boolean resultadoA = i + k <= j - k * 3 && k >= 2;
        System.out.println("a) " + resultadoA);

        // b)
        i = 3; j = 2; k = -1;
        boolean resultadoB = i == 3 || j <= 2 && k > 0;
        System.out.println("b) " + resultadoB);

        // c)
        double tipo = 10, rede = 7.5;
        boolean resultadoC = tipo < rede + 1.5;
        System.out.println("c) " + resultadoC);

        // d)
        int ano = 1993;
        boolean resultadoD = ano % 400 == 0;
        System.out.println("d) " + resultadoD);

        // e)
        boolean resultadoE = 3 == 2 || 5 > 1 + 1;
        System.out.println("e) " + resultadoE);

        // f)
        boolean resultadoF = 5 - 2 > 4 && !(0.5 == 1 / 5.0);
        System.out.println("f) " + resultadoF);

        // g)
        int a = 2, b = 5, c = 6, d = 10;
        boolean resultadoG = a >= b || a >= c && a < d;
        System.out.println("g) " + resultadoG);

        // h)
        boolean resultadoH = a + b < c && a + c < d || 2 * a < a + b;
        System.out.println("h) " + resultadoH);

        // i)
        boolean resultadoI = !(a * b < d) && !(a * b < c) || b + c <= d;
        System.out.println("i) " + resultadoI);
    }
}