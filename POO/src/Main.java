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


        System.out.println(ContaCorrente.cintadorContas);
    ContaCorrente contaDani = new ContaCorrente("Pepe","12345678Z",1000,"123456789");
    contaDani.SacarDinero(100);
    contaDani.ingresarDinero(2000);
        System.out.println(contaDani.mostrarInformacion());
        System.out.println(ContaCorrente.cintadorContas);


        Reloj hoy = new Reloj(14,12,20);
        System.out.println(hoy.mostrarHora());



    }
}