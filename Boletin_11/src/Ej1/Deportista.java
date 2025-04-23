package Ej1;

public class Deportista extends Persoa {
    private String deporte;
    private String clube;
    private String licencia;

    public Deportista(String deporte, String clube, String licencia,String nome, String direccion, String dni) throws DniNonValido, LicenciaNonValida {
        super(nome,direccion,dni);
        this.deporte = deporte;
        this.clube = clube;
        setLicenza(licencia);
    }


    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicenza(String licenza) throws LicenciaNonValida {
        if (!licenza.matches("\\d{4}[a-zA-Z]{3}\\d{6}")) { // Validar formato de licencia
            throw new LicenciaNonValida("Licenza introducida no válida: " + licenza);
        }
        this.licencia = licenza;
    }
}

