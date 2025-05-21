import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ej7 {
    public class Conxuntos {

        // Método estático xenérico que fai a unión de dous conxuntos
        public static <E> Set<E> union(Set<E> conxunto1, Set<E> conxunto2) {
            Set<E> resultado = new HashSet<>(conxunto1); // Copiamos o primeiro conxunto
            resultado.addAll(conxunto2); // Engadimos todos os elementos do segundo
            return resultado;
        }

        // Exemplo de uso
        public static void main(String[] args) {
            Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3, 4));
            Set<Integer> b = new HashSet<>(Arrays.asList(3, 4, 5, 6));

            Set<Integer> resultadoUnion = union(a, b);

            System.out.println("Conxunto 1: " + a);
            System.out.println("Conxunto 2: " + b);
            System.out.println("Unión: " + resultadoUnion);
        }
    }
}
