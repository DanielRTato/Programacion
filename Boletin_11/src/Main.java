import Ej1.Deportista;
import Ej1.DniNonValido;
import Ej1.LicenciaNonValida;
import Ej1.Persoa;

public class Main {
    public static void main(String[] args) {


        try {

            Deportista deportista = new Deportista("Carlos", "Baloncesto", "1234bal123456", "Juan", "Calle asdf", "12345678A");
            System.out.println("Nombre: " + deportista.getNome());
            System.out.println("DNI: " + deportista.getDni());
            System.out.println("Licencia: " + deportista.getLicencia());
        } catch (DniNonValido | LicenciaNonValida e) {
            System.out.println(e.getMessage());
        }
    }
}