public class Main {
    public static void main(String[] args) {

    Libro libro1 = new Libro();

        libro1.amorsar(); // mostrar el contructor por defecto
        System.out.println("---------------------");

        libro1.setAno(2015);
        System.out.println(libro1.getAno());
        libro1.setAutor("Brandoom");
        System.out.println(libro1.getAutor());
        libro1.setTitulo("Juramentada");
        System.out.println(libro1.getTitulo());
        libro1.setNumPaginas((short) 1435);
        System.out.println(libro1.getNumPaginas());
        libro1.setValoracion(4.5f);
        System.out.println(libro1.getValoracion());

        System.out.println("---------------------");
        libro1.amorsar();

        System.out.println("---------------------");
        Libro libro2 = new Libro("king", "toking", 123, (short) 400,4);
        libro2.amorsar();

        System.out.println("---------------------");

        Consumo consume  = new Consumo();

        consume.setLitros(50);
        consume.setPGas(1.57f);

        System.out.println("---------------------");
        Consumo consume1 = new Consumo(120,50,50,1.70f);

        System.out.println(consume1.consumoMedio());
        consume1.setLitros(60);
        System.out.println(consume1.getvMedvelocidade());


        System.out.println("---------------------");










    }
}