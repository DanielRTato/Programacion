import java.util.ArrayList;
import java.util.Collection;

public class ColeecionNumeros {
    public static void main(String[] args) {
        Collection<Integer> numeros = new ArrayList<>();
        for (int i = 0; i<100; i++) {
            numeros.add((int) (Math.random()*10+1));
        }
    }
}
