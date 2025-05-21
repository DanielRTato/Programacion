package Ej9;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Rexistro implements Serializable {
    private double temperatura;
    private LocalDateTime hora;

    public Rexistro(double temperatura) {
        this.temperatura = temperatura;
        this.hora = LocalDateTime.now();
    }

    public double getTemperatura() {
        return temperatura;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        return "Hora: " + hora.format(formato) + " - Temperatura: " + temperatura + "°C";
    }
}
