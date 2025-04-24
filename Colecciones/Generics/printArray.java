package Generics;

public class printArray <T> {

    public static <T> void printArray (T[] inpuArr){
        for (T elemet : inpuArr){
            System.out.println(elemet + " ");
        }
        System.out.println();
    }
}
