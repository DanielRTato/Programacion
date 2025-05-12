import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EjemploColecciones {
    public static void main(String[] args) {

        Collection<Cliente> coleccionCliente;

        coleccionCliente = new ArrayList<>();
        coleccionCliente.add(new Cliente("12345678X","Juan","23/05/1996"));
        coleccionCliente.add(new Cliente("98765432T","Alex","10/12/2008"));
        coleccionCliente.add(new Cliente("24681234Z","Maria","01/07/2020"));
        Cliente unCliente = new Cliente("5432442423Y", "Dani", "02/12/1996");
        coleccionCliente.add(unCliente);
        System.out.println(coleccionCliente);

        // Collections.sort(coleccionCliente);
    }
}
