package Texto;

public class Deportista {
    private String dni;
    private String nombre;
    private String licencia;

    public Deportista(String dni, String nombre, String licencia) {
        this.dni = dni;
        this.nombre = nombre;
        this.licencia = licencia;
    }

    // Método para convertir a formato texto (para guardar en archivo)
    public String toTexto() {
        return dni + ";" + nombre + ";" + licencia;
    }

    // Método para mostrar en pantalla
    @Override
    public String toString() {
        return "DNI: " + dni + " | Nombre: " + nombre + " | Licencia: " + licencia;
    }
}
