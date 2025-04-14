package Ej1;

public class Deportista extends Persoa {
    private String deporte;
    private String clube;
    private String licencia;

    public Deportista(String deporte, String clube, String licencia,String nome, String direccion, String dni) throws DniNonValido {
        super(nome,direccion,dni);
        this.deporte = deporte;
        this.clube = clube;
        setLicencia(licencia);
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

    public void setLicencia(String licencia) {
        if (licencia != null
                && licencia.length() == 13
                && licencia.substring(0, 4).matches("\\d{4}")
                && licencia.substring(4, 7).matches("[a-zA-Z]{3}")
                && licencia.substring(7).matches("\\d{6}")) {
            System.out.println("Licencia correcta");
            this.licencia = licencia;
        } else {
            System.out.println("Licencia no valida");
        }
    }
}