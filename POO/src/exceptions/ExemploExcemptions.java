package exceptions;

public class ExemploExcemptions {
    public static void main(String[] args) {

        int a,b,c;
        a = 0;
        b= 0;

        try {
            c = a / b;
        } catch (ArithmeticException | IllegalArgumentException erro) {
            System.out.println("Intentalo de nuevo");
            System.out.println(erro.getMessage());
        }//catch (Exception erro2){
         //   System.out.println(erro2.getMessage());
        //}
        finally {
            System.out.println("Siempre se ejecuta");
        }

    }
}
