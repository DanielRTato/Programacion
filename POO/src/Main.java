public class Main {
    public static void main(String[] args) {

    Calendario cal = new Calendario(28,1,2024);

    cal.getYear();
    cal.getDay();
    cal.incrementarDia();
    cal.getMonth();
    cal.incrementaMes();
    cal.incrementarDia();
    cal.monstrarData();

    ContaCorrente conta = new ContaCorrente("Pepe","123456789",1000,"123456789");
    conta.SacarDinero(100);
    conta.ingresarDinero(2000);
        System.out.println(conta.mostrarInformacion());



    }
}