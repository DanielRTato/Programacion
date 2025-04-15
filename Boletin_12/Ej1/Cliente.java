package Ej1;

public class Cliente {
    private String id;
    private String nome;
    private int telefono;

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

    public void listarClientes(){

    }

}
