package EjemploExamen1;

import java.io.Serializable;

public class Deportista extends Persoa implements Serializable {
    private String licenza;
    private Data dataNacemento;
    private String deporte;

    public Deportista(String dni, String nome, String licenza, Data dataNacemento)throws DniNonValido, LicenzaNonValida {
        super(dni, nome);
        setLicenza(licenza);
        this.dataNacemento = dataNacemento;
        this.deporte = determinarDeporte(licenza);
    }

    public void setLicenza(String licenza) throws LicenzaNonValida {
        if (!licenza.matches("^\\d{4}[a-z]{3}\\d{7}$")) {
            throw new LicenzaNonValida("Licenza debe ser aaaadddnnnnnnn");
        }
        this.licenza = licenza;
        this.deporte = determinarDeporte(licenza);
    }

    private String determinarDeporte(String licenza) {
        String codigo = licenza.substring(4, 7);
        switch (codigo) {
            case "fut": return "Fútbol";
            case "bal": return "Baloncesto";
            case "ten": return "Tenis";
            case "nat": return "Natación";
            default: return "Outro";
        }
    }

    public String getLicenza() {
        return licenza;
    }

    public Data getDataNacemento() {
        return dataNacemento;
    }

    public String getDeporte() {
        return deporte;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + deporte + " | Lic: " + licenza +
                " | Nacemento: " + dataNacemento;
    }
}
