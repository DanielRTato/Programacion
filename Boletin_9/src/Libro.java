public class Libro {
    private String titulo;
    private String autor;
    private int ano;
    short numPaginas;
    float valoracion;

    public Libro(){
        //el constructor por defecto
    }

    public Libro(String titulo, String autor, int ano, short numPaginas, float valoracon){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
        this.valoracion = valoracon;
    }
}
