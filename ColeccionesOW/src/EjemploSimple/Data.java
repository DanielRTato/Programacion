package EjemploSimple;

public class Data implements java.io.Serializable {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) throws FormatoDataErroneo {
        if (ano < 1970 || ano > 2999) {
            throw new FormatoDataErroneo("Ano non válido (1970-2999)");
        }

        if (mes < 1 || mes > 12) {
            throw new FormatoDataErroneo("Mes non válido (1-12)");
        }

        int maxDias = obtenerDiasMes(mes, ano);
        if (dia < 1 || dia > maxDias) {
            throw new FormatoDataErroneo("Día non válido para este mes");
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    private int obtenerDiasMes(int mes, int ano) {
        switch (mes) {
            case 2: return esBisiesto(ano) ? 29 : 28;
            case 4: case 6: case 9: case 11: return 30;
            default: return 31;
        }
    }

    private boolean esBisiesto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}