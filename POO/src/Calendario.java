/**
 * incrementarDia()   incrementarMes()   incrementarAno()
 * monstrarData()   dataIgual(data outraData)boolean
 */
public class Calendario {
    private int day;
    private int month;
    private int year;

    public Calendario (int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void incrementarDia(){
        day++;
        if (day>monthLong( month, year)){
            day= 1;
            month ++;
        }
        if (month>12){
            month = 1;
            year++;
        }
    }
    private int monthLong ( int month, int year){
        switch (month){
            case 4,6,9,11: return 30;
        case 2:
            if (isLeapYear(year)){
                return 29;
        }else {
            return 28;
            }
        default: return 31;
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

    public void incrementaMes (){
        month++;
        if (month>12){
            year++;
            month = 1;
        }
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day>0 && day<=monthLong(month,year))this.day = day;
        else
            throw new RuntimeException("El dia debe ser entre 1 y 31");
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month>0 && month<13) this.month = month;
        else
            throw new RuntimeException("El mes debe ser entre 1 y 12");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year>=0)this.year = year;
        else
            throw new RuntimeException("El valor del ano debe ser positivo");
    }
}
