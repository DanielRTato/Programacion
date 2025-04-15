package Ej2;

public class Data {

    private int day;
    private int month;
    private int year;

    public Data(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void incrementaAno() {
        if (year < 2147483647) year++;
        else
            throw new RuntimeException("Valor demasiado grande");
    }

    public void incrementaMes() {
        month++;
        if (month > 12) {
            year++;
            month = 1;
        }
    }

    public void incrementarDia() {
        day++;
        if (day > monthLong(month, year)) {
            day = 1;
            month++;
        }
        if (month > 12) {
            incrementaMes();
        }
    }

    private int monthLong(int month, int year) {
        switch (month) {
            case 4, 6, 9, 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }

    private boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public void monstrarData() {
        System.out.println("La fecha es " + day + "-" + month + "-" + year);
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day <= monthLong(month, year)) this.day = day;
        else
            throw new FormatoDataErroneoException("El dia debe ser entre 1 y 31");
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month < 13) {
            this.month = month;
        } else
            throw new FormatoDataErroneoException("Introduce un mes valido (1-12)");
    }

        public int getYear () {
            return year;
        }

        public void setYear (int year){
            if (year >= 1970 && year <= 2999) this.year = year;
            else
                throw new FormatoDataErroneoException("El año debe estar entre el 1970 y el 2999");
        }
    }
