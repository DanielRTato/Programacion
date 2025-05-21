package EjemploExamen1;

public class Persoa {
    private String dni;
    private String nome;

    public Persoa(String dni, String nome) throws DniNonValido {
        setDni(dni);
        this.nome = nome;
    }

    public void setDni(String dni) throws DniNonValido {
        if (!dni.matches("^\\d{8}[A-Za-z]$")) {
            throw new DniNonValido("DNI debe ter 8 díxitos e 1 letra");
        }
        this.dni = dni.toUpperCase();
    }

    public String getDni() {
        return dni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return dni + " - " + nome;
    }
}