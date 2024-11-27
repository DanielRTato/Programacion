import java.util.Arrays;

public class iguais {
    public static void main(String[] args) {
        int [] t1={1,2,3};
        int [] t2={1,2,3};
        if (t1==t2) System.out.println("iguais");
        else System.out.println("distintas");

        if (Arrays.equals(t1, t2))
            System.out.println("iguais");
        else
            System.out.println("distintas");

    }
}
