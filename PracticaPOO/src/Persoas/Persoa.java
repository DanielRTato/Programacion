package Persoas;

public class Persoa {
    private String nome;
    private String direccion;
    private String dni;

    public Persoa(String nome, String direccion, String dni) {
        this.nome = nome;
        this.direccion = direccion;
        this.dni = dni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
