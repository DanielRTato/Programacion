import java.io.*;

public class Cancion  implements Serializable {
    private String titulo;
    private String artista;

    /**
     * Constructor clase cancion
     * @param titulo
     * @param artista
     */
    public Cancion(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;            }

    public String getArtista() {
        return artista;
    }
    public void setArtista(String titulo){
        this.artista=artista;
    }
    public String toString(){
        return titulo + " - " + artista;
    }

}


