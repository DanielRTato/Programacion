public class Ej4 {
    public static void main(String[] args) {
        // a) true && true == false
        boolean resultadoA = true && true == false;
        System.out.println("a) " + resultadoA);

        // b) !false == true
        boolean resultadoB = !false == true;
        System.out.println("b) " + resultadoB);

        // c) (true && true) || false == true
        boolean resultadoC = (true && true) || false == true;
        System.out.println("c) " + resultadoC);

        // d) (false || false) && false != true
        boolean resultadoD = (false || false) && false != true;
        System.out.println("d) " + resultadoD);

        // e) (!(true && false)) == false
        boolean resultadoE = (!(true && false)) == false;
        System.out.println("e) " + resultadoE);

        // f) "12" + "12" == "24"
        boolean resultadoF = "12" + "12" == "24";
        System.out.println("f) " + resultadoF);

        // g) "34" + "43" == "3443"
        boolean resultadoG = "34" + "43" == "3443";
        System.out.println("g) " + resultadoG);
    }
}