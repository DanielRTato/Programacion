import java.util.Arrays;

public class iguais {
    public static void main(String[] args) {
        int [] t1={1,2,3,4};
        int [] t2={1,2,3,4};
        if (t1==t2) System.out.println("iguais");
        else System.out.println("distintas");

        if (Arrays.equals(t1, t2))
            System.out.println("iguais");
        else
            System.out.println("distintas");

        int [][] taboa={{1,2,3,4},{4,5,6,7,8,9,1},{1,3,1,4}};
        System.out.println(taboa.length);
        System.out.println(taboa[2].length);

    }
}
