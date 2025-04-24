import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TratamentoDeClientes {
    public static void main(String[] args) {
        Collection<Cliente> coleccionCliente;

        coleccionCliente = new ArrayList<>();
        coleccionCliente.add(new Cliente("12345678X","Juan","23/05/1996"));
        coleccionCliente.add(new Cliente("98765432T","Alex","10/12/2008"));
        coleccionCliente.add(new Cliente("24681234Z","Maria","01/07/2020"));
        Cliente unCliente = new Cliente("5432442423Y", "Dani", "02/12/1996");

        System.out.println(coleccionCliente.contains(unCliente));
        System.out.println(coleccionCliente.size());
        coleccionCliente.add(unCliente);
        coleccionCliente.remove(unCliente);
        //coleccionCliente.clear();

        System.out.println(coleccionCliente.size());
        System.out.println(coleccionCliente.isEmpty());
        System.out.println(coleccionCliente.contains(unCliente));

        Object [] clientes = coleccionCliente.toArray();
        Iterator<Cliente> indice = coleccionCliente.iterator();

        for (; indice.hasNext();){
            System.out.println(indice.hasNext());
        }
        for (Cliente cli : coleccionCliente){
            System.out.println(cli);
        }






    }
}
