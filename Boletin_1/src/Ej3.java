public class Ej3 {
    public static void main(String[] args) {
        int m = 1, n = 2, p = 3, q = 4, r = 5, s = 6, t = 7, i = 8;
        double result;

        // a)
        result = m + n * n;
        System.out.println("a) " + result);

        // b)
        result = m + n * p * p - r * s;
        System.out.println("b) " + result);

        // c)
        result = m + 4 * p - q;
        System.out.println("c) " + result);

        // d)
        result = Math.cbrt(100);
        System.out.println("d) " + result);

        // e)
        result = m + n * p + q * r;
        System.out.println("e) " + result);

        // f)
        result = m * n * p + q;
        System.out.println("f) " + result);

        // g)
        result = n * (1 + i * t) / (1.0 + i * t - 1);
        System.out.println("g) " + result);
    }
}