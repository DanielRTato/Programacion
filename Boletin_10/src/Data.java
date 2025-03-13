public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(String fecha) {
        if (fecha.matches("\\d{2}-\\d{2}-\\d{4}")) {
            String[] partes = fecha.split("-");
            this.dia = Integer.parseInt(partes[0]);
            this.mes = Integer.parseInt(partes[1]);
            this.ano = Integer.parseInt(partes[2]);
        } else {
            throw new RuntimeException("Formato de fecha invalido. Debe ser 00-00-0000");
        }
    }

    // Getters y setters para dia, mes y ano
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}