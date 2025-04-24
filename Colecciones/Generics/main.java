package Generics;

public class main {
    public static void main(String[] args) {

        // Creo deferentes tipos de arrays
        Integer[] intArr = {1,2,3,4,5};
        Double[]  doubleArr ={1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArr = {'A', 'B', 'C', 'D', 'E'};

        System.out.println("El array int contine;");
        printArray.printArray(intArr); // confuso es confuso el nombre de la clase y del metodo

        System.out.println("El array double contine;");
        printArray.printArray(doubleArr);

        System.out.println("El array character contine;");
        printArray.printArray(charArr);
    }

}
