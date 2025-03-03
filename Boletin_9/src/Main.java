public class Main {
    public static void main(String[] args) {

    Libro jur = new Libro();

        jur.setAno(2015);
        System.out.println(jur.getAno());
        jur.setAutor("Brandoom");
        System.out.println(jur.getAutor());
        jur.setTitulo("Juramentada");
        System.out.println(jur.getTitulo());
        jur.setNumPaginas((short) 1435);
        System.out.println(jur.getNumPaginas());
        jur.setValoracion(4.5f);
        System.out.println(jur.getValoracion());
        System.out.println("---------------------");
        jur.amorsar();





    }
}