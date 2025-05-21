package Ej11;

public class Academico implements Comparable<Academico> {
    private String nome;
    private int anoIngreso;

    public Academico(String nome, int anoIngreso) {
        this.nome = nome;
        this.anoIngreso = anoIngreso;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoIngreso() {
        return anoIngreso;
    }

    @Override
    public int compareTo(Academico outro) {
        return this.nome.compareTo(outro.nome); // Ordenación natural por nome
    }

    @Override
    public String toString() {
        return nome + " (" + anoIngreso + ")";
    }
}

