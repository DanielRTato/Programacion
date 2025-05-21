import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ej8 {
    // Método xenérico para a intersección de dous conxuntos
    public static <E> Set<E> interseccion(Set<E> conxunto1, Set<E> conxunto2) {
        Set<E> resultado = new HashSet<>(conxunto1); // Copiamos o primeiro conxunto
        resultado.retainAll(conxunto2); // Conservamos só os elementos que tamén están no segundo
        return resultado;
    }

    // Exemplo de uso
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> b = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        Set<Integer> resultadoInterseccion = interseccion(a, b);

        System.out.println("Conxunto 1: " + a);
        System.out.println("Conxunto 2: " + b);
        System.out.println("Intersección: " + resultadoInterseccion);
    }
}

