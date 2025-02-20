public class Reloj {
    private int segundo;
    private int minuto;
    private int hora;
    private Formato formato;

    public enum Formato {
        AM,
        PM
    }

    public Reloj(int segundo, int minuto, int hora) {
        this.segundo = segundo;
        this.minuto = minuto;
        setHora(hora);

    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) this.segundo = segundo;
        else throw new RuntimeException("Segundos no validos");
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) this.minuto = minuto;
        else throw new RuntimeException("minutos no validos");
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
            if (hora < 12) {
                this.formato = Formato.AM;
            } else {
                this.formato = Formato.PM;
            }
        } else throw new RuntimeException("Horas no validas");
    }

    public String mostrarHora() {
        return "la hora es: " + hora + "/" + minuto + "/" + segundo;
    }

}