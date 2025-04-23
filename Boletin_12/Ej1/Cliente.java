package Ej1;

import java.io.*;
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

    public static void guardarDatos () {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(clientes);
        } catch (IOException e) {
            System.out.println("Erro ao gardar os datos: " + e.getMessage());
        }
    }

    public static void cargarDatos() {
        File ficheiro = new File(archivo);
        if (ficheiro.exists()) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
                clientes = (List<Cliente>) in.readObject();
                System.out.println("Datos cargados correctamente.");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Erro ao cargar os datos: " + e.getMessage());
            }
        } else {
            System.out.println("Comezando con lista baleira.");
        }
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

    public static void mostrarCliente () {
        for (Cliente c : clientes){
            System.out.println(c);
        }
    }



}
