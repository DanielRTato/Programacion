/**
 * Compara dos Strings
 */
public class Ej8 {
    public static void main(String[] args) {

        String texto1 = "Java";
        String texto2= "JavaScript";
        boolean comparacion;

      comparacion= texto1.equalsIgnoreCase(texto2);

      if (comparacion){
          System.out.println("Son iguales");
      }else{
          System.out.println("Son distintos");
      }
    }
}
