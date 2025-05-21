package Ej10;

import java.io.Serializable;

public class Produto implements Serializable {
    private String codigo;
    private String nome;
    private int cantidade;

    public Produto(String codigo, String nome, int cantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.cantidade = cantidade;
    }

    public String getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public int getCantidade() { return cantidade; }

    public void setCantidade(int cantidade) { this.cantidade = cantidade; }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Cantidade: " + cantidade;
    }
}

