public class main {
    public static void main(String[] args) {

        SocioA pepe2 = new SocioA("12345678A", "Pepe", 20, "10-05-2000", "12345678Z", "pepe2");
        VoluntarioA ana2 = new VoluntarioA(30, "Ingeniera", 20.0, "Calle Real 456", "Barcelona", 0.0, "01-02-2021", "12345678Z", "Ana");
        AsalariadoA juan2 = new AsalariadoA("Dis", 10.4,11.5,10.2,"Juan2","12345678Z","00-00-2000");

        System.out.println(pepe2.getDataAlta());


    }
}