public class Ej2 {
    public static void main(String[] args) {
eco(5);
    }
    public static void eco(int n){
        if (n>0){
            System.out.println("Ecoo….");
            eco(n-1);
        }
    }
}
