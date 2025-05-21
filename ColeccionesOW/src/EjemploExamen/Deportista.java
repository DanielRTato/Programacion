package EjemploExamen;

import java.io.Serializable;

public class Deportista extends Persoa implements Serializable {
    String licenza;
    String deporte;

    public Deportista(String nome, String dni, Data data, String licenza, String deporte)
            throws DniNonValidoException, FormatoLicenzaException, FormatoDataErroneoException {
        super(nome, dni, data);
        if (!licenza.matches("\\d{4}[a-z]{3}\\d{6}"))
            throw new FormatoLicenzaException("Formato de licenza incorrecto");
        this.licenza = licenza;
        this.deporte = deporte;
    }

    public String toString() {
        return super.toString() + " - Licenza: " + licenza + " - Deporte: " + deporte;
    }

    public String getNome() { return nome; }
    public String getDni() { return dni; }
    public String getDeporte() { return deporte; }
    public String getLicenza() { return licenza; }
}