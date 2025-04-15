package Ej2;

public class App {
    public static void main(String[] args) {

    try {
        Data hoy = new Data(111,04,2999);

    } catch (FormatoDataErroneoException e) {
        System.out.println(e.getMessage());
    }

    }
}
