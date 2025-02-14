import java.util.ArrayList;

/**
 *
 *
 */
public class Ej1 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        desenvolver("escasa",3,lista);

        for (String palabra:lista) {
            System.out.println(palabra);
        }


    }
    public static void desenvolver(String palabra, int n,ArrayList<String> lista){

        for (int i=0; i<=palabra.length()-n;i++){
            String str= palabra.substring(i,n+i);
            lista.add(str);



        }

    }

}