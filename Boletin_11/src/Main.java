import Ej1.Deportista;
import Ej1.DniNonValido;
import Ej1.Persoa;

public class Main {
    public static void main(String[] args) {


        try {
            Deportista Juan = new Deportista("Baloncesto", "Celta", "1234bal123456", "Juan", "Calle sdfd", "123R");
            Persoa Alex = new Persoa("Alez", "dsfsdf" , "123134");

    }catch (DniNonValido e){
            System.out.println("Error con el dni" + e.getMessage());
        }
    }
}