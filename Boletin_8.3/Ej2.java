public class Ej2 {
    public static void main(String[] args) {


        String texto = """ 
                ¿Dónde puedo conseguirlo?
                
                  Hay muchas variaciones de los pasajes de Lorem Ipsum disponibles,
                   pero la mayoría sufrió alteraciones en alguna manera, ya sea porque se le 
                   agregó humor, o palabras aleatorias que no parecen ni un poco creíbles. Si 
                   vas a utilizar un pasaje de Lorem Ipsum, necesitás estar seguro de que no hay 
                   nada avergonzante escondido en el medio del texto. Todos los generadores de 
                   Lorem Ipsum que se encuentran en Internet tienden a repetir 
                   trozos predefinidos cuando sea necesario, haciendo a este el único 
                   generador verdadero
                    (válido) en la Internet. Usa un diccionario de mas de 200 palabras 
                    provenientes del latín, combinadas con estructuras muy útiles de sentencias, 
                    para generar texto de Lorem Ipsum que parezca razonable.
                     Este Lorem Ipsum generado siempre estará libre de repeticiones, humor a
                    gregado o palabras no características del lenguaje, etc.
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
