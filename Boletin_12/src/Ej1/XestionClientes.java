package Ej1;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class XestionClientes {
    private static final String fichero = "clientes.txt";
    private static final int limite = 10;
    private Cliente[] clientes;
    private int numClientes;
    private Scanner scanner;

    public XestionClientes(Cliente[] clientes, int numClientes, Scanner scan) {
        this.clientes = new Cliente[limite];
        this.numClientes = numClientes;
        this.scanner = new Scanner(System.in);
        this.numClientes = 0;
    }

    private void guardarClientes(){
        try (PrintWriter e = new PrintWriter(new FileWriter(fichero))){

        }
    }

}
