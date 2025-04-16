package Ej1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente implements Serializable {
    private String id;
    private String nome;
    private int telefono;
    private static final String archivo  = "nombre.txt";
    private static List<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {

    }

    public Cliente (String id, String nome, int telefono) {
        this.id = id;
        this.nome = nome;
        this.telefono = telefono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void  engadirCliente (Scanner teclado) {
        System.out.println("Introduce el id");
        String id = teclado.nextLine();
        teclado.nextLine();
        System.out.println("Introduce el nombre");
        String nombre = teclado.nextLine();
        teclado.nextLine();
        System.out.println("Introduce el número de teléfono");
        int numero = teclado.nextInt();

        clientes.add(new Cliente(id,nombre,numero));
        System.out.println("Cliente añadido");
    }



}
