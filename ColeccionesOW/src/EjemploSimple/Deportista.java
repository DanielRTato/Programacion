package EjemploSimple;

import java.io.Serializable;

public class Deportista implements Serializable {

    private String dni;
    private String nombre;
    private String licencia;
    private Data dataNacemento;
    private String deporte;

    public Deportista(String dni, String nombre, String licencia, Data dataNacemento)
            throws DniNonValido, LicenzaNonValida {
        setDni(dni);
        setNombre(nombre);
        setLicencia(licencia);
        this.dataNacemento = dataNacemento;
    }

    public void setDni(String dni) throws DniNonValido {
        if (!dni.matches("^\\d{8}[A-Za-z]$")) {
            throw new DniNonValido("DNI debe tener 8 díxitos e 1 letra");
        }
        this.dni = dni.toUpperCase();
    }

    public void setLicencia(String licencia) throws LicenzaNonValida {
        if (!licencia.matches("^\\d{4}[a-z]{3}\\d{7}$")) {
            throw new LicenzaNonValida("Licencia debe ser aaaadddnnnnnnn");
        }
        this.licencia = licencia;
        this.deporte = determinarDeporte(licencia);
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

    // Getters
    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getLicencia() { return licencia; }
    public Data getDataNacemento() { return dataNacemento; }
    public String getDeporte() { return deporte; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return dni + " - " + nombre + " | " + deporte +
                " | Lic: " + licencia + " | Nace: " + dataNacemento;
    }
}