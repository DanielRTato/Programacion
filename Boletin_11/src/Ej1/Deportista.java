package Ej1;

public class Deportista {
    private String deporte;
    private String clube;
    private int licencia;

    public Deportista(String deporte, String clube, int licencia) {
        this.deporte = deporte;
        this.clube = clube;
        this.licencia = licencia;
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

    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }
}
