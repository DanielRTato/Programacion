package Ej1;


import java.io.Serializable;

public class Cliente implements Serializable {

    private int id;
    private String nome;
    private int telefono;

    public Cliente(int id, String nome, int telefono) {
        this.id = id;
        this.nome = nome;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public static void engadirCliente(){

    }

    public static void modificarDatos(){

    }

    public static void darDeBaixa(){

    }

    public static void listarClientes(){

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
