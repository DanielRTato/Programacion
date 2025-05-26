package mioExamen.Ej2;

import java.io.Serializable;

public class Contacto implements Serializable {
    private String nome;
    private String telefono;

    public Contacto (String nome, String telefono)  {
        this.nome = nome;
        this.telefono = telefono;
    }

    public String getNome() {
        return nome;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono (String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return  nome + " " + " Teléfono: " + telefono;
    }
}
