package EjemploExamen;

import java.io.Serializable;

public class Data implements Serializable {
    int dia, mes, ano;

    public Data(int dia, int mes, int ano) throws FormatoDataErroneoException {
        if (ano < 1970 || ano > 2999) throw new FormatoDataErroneoException("Ano non válido");
        if (mes < 1 || mes > 12) throw new FormatoDataErroneoException("Mes non válido");

        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && bisiesto(ano)) diasMes[1] = 29;
        if (dia < 1 || dia > diasMes[mes - 1]) throw new FormatoDataErroneoException("Día non válido");

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    private boolean bisiesto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

}


