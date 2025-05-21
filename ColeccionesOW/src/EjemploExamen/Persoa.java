package EjemploExamen;

class Persoa implements java.io.Serializable {
    String nome;
    String dni;
    Data dataNacemento;

    public Persoa(String nome, String dni, Data data) throws DniNonValidoException {
        if (!dni.matches("\\d{8}[A-Z]")) throw new DniNonValidoException("DNI non válido");
        this.nome = nome;
        this.dni = dni;
        this.dataNacemento = data;
    }

    public String toString() {
        return nome + " - DNI: " + dni + " - Nacemento: " + dataNacemento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Data getDataNacemento() {
        return dataNacemento;
    }

    public void setDataNacemento(Data dataNacemento) {
        this.dataNacemento = dataNacemento;
    }
}

