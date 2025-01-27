public class Ej2 {
    public static void main(String[] args) {


        String texto = """ 
                DANIEL TATO
                sdfdsfdsfsdfdsfs
                dsfdsdsfdsf
                sdf
                df
                """;

        formato(texto);
    }

    public static void formato(String texto){

        int titulo = texto.indexOf("\n");

        String prim = texto.substring(0,titulo);
        String fin = texto.substring(titulo);

        System.out.println("<h1>"+prim+"</h1>"+ "\n"+"<p2>"+fin+"</p>");


    }
}
