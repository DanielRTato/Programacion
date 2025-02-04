Creación de una Cadena de Caracteres

Para crear una cadena de caracteres en Java, se pueden usar dos métodos principales: mediante la asignación directa de una cadena de caracteres a una variable o a través del constructor String().

// Asignación directa
String str1 = "Hola mundo";

// Usando el constructor de String
String str2 = new String("Hola mundo");

Aunque ambas formas crean una cadena de caracteres, hay una diferencia fundamental entre ellas. La asignación directa reutiliza las instancias de String existentes del "string pool", un grupo de cadenas de caracteres que Java mantiene en memoria para ahorrar espacio, mientras que el constructor de String siempre crea una nueva instancia de String.
Métodos Principales de la Clase String

Ahora, se revisarán algunos de los métodos más utilizados de la clase String:

1. length():

Este método retorna el número de caracteres en la cadena.

String str = "Hola mundo";
int len = str.length();  // len será 10

2. charAt(int index):

Este método retorna el carácter en el índice especificado. En Java, los índices de las cadenas empiezan desde 0.

String str = "Hola mundo";
char c = str.charAt(0);  // c será 'H'

3. substring(int beginIndex, int endIndex):

Este método retorna una subcadena de la cadena original, comenzando desde beginIndex hasta endIndex - 1.

String str = "Hola mundo";
String substr = str.substring(0, 4);  // substr será "Hola"

4. equals(Object obj):

Este método compara la cadena con obj y retorna true si son iguales y false si no lo son.

String str1 = "Hola mundo";
String str2 = "Hola mundo";
boolean isEqual = str1.equals(str2);  // isEqual será true

5. toLowerCase():

Este método retorna una copia de la cadena original en minúsculas.

String str = "HOLA MUNDO";
String lowerCaseStr = str.toLowerCase();  // lowerCaseStr será "hola mundo"

6. toUpperCase():

Este método retorna una copia de la cadena original en mayúsculas.

String str = "hola mundo";
String upperCaseStr = str.toUpperCase();  // upperCaseStr será "HOLA MUNDO"

7. contains(CharSequence sequence):

Este método verifica si la cadena contiene la secuencia especificada.

String str = "Hola mundo";
boolean contains = str.contains("mundo");  // contains será true

8. replace(CharSequence target, CharSequence replacement):

Este método reemplaza todas las ocurrencias de target en la cadena con replacement.

String str = "Hola mundo";
String replacedStr = str.replace("mundo", "Java");  // replacedStr será "Hola Java"

9. split(String regex):

Este método divide la cadena en un array de subcadenas basado en el regex proporcionado.

String str = "Hola mundo Java";
String[] parts = str.split(" ");  // parts será ["Hola", "mundo", "Java"]

10. trim():

Este método elimina los espacios en blanco al inicio y al final de la cadena.

String str = " Hola mundo ";
String trimmedStr = str.trim();  // trimmedStr será "Hola mundo"


* MÉTODOS:
*
*  - .length(-> Devuelve longitud String
* - .charAt() -› Devuelve carácter según posición en string
* - .compareTo() <> .equals() -> Compara dos String teniendo en cuenta gayus y minus
* - .conpareToIgnoreCase() <→> .equalsIgnoreCase() -> Compara dos String sin tener en cuenta Mayus y minus
* - .concat() -> Concatena dos o mas Strings
* - .contains() > Verifica si una cadena especifica se encuentra en un String
* - .startswith() -> Verifica si un String comienza con una cadena especifica
* - .endsWith() -› Verifica si un String ternina con una cadena especifica
* - .indexof( -> Devuelve primera coincidencia en String según cadena especifica
* - .lastIndex0f() -> Devuelve última coincidencia en String según cadena especifica
* - .replace() → Remplaza cadenas en un String
* - .toLowerCase() -> Convierte String en minúsculas
* - .toUpperCase() →> Convierte String en mayúsculas
* - .trim() -> Elimina espacios al final e inicio de un String
* - .substring() -> Extrae caracteres de un String según dos posiciones, intolo y fin.
*
*/

import java.sql.SQLOutput;

public class estudioStrings {
public static void main(String[] args) {


        String cadena = "Soy Saul Alvarez"; //DECLARACION NORMAL DE STRING

        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        // .LENGTH

        int largo = cadena.length(); // OBTENER LARGO DE LA CADENA :: RETORNA NUMERO ENTERO ( NÚMERO EL CUAL HACE REFERENCIA A LA LONGITUD DEL STRING )
        System.out.println("// .LENGTH = El string * "+ cadena + " * tiene " + largo +  " caracteres contando los espacios en blanco");
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // CHARAT()

        char letraEncontrada = cadena.charAt(5); // OBTENER EL CARACTER QUE HAY EN EL INDICE INDICADO EN LOS PARAMETROS DEL METODO
        System.out.println("// .CHARAT = En el string * " + cadena + " * la letra que se encuentra en la posición 5 es la (" + letraEncontrada+")");
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // COMPARETO() e EQUALS()

        /* 
         * ( COMPARE TO DEVUELVE 0 SI SON IGUALES O UN NUMERO DISTINO CUADNO LOS STRIGNS A COMPARAR NO SON IGUALES ) 
         * ( EQUALS DEVUELVE TRUE O FALSE DEPENDIENDO SI SON O NO IGUALES ) 
         */

        String segundaCadena = "Soy Saul DAM";
        String terceraCadena = "Saul saul alvarez";
        String cuartaCadena = "soy saul alvarez";

        int resultadoComparacion = cadena.compareTo(segundaCadena);
        int resultadoMayusculasCompareTo = cadena.compareToIgnoreCase(cuartaCadena);

        boolean resultadoComparacionEquals = cadena.equals(segundaCadena);
        boolean resultadoComparacionEqualsIgnoreCase = cadena.equalsIgnoreCase(cuartaCadena);

        System.out.println("// .COMPARETO = Si el resultado es 0, estos Strings /" + cadena+"/ y /" + segundaCadena + "/ son iguales");
        System.out.println("Resultado = " + resultadoComparacion);
        System.out.println();

        System.out.println("// .COMPARETOIGNORECASE compareToIgnoreCase no distingue entre mayusculas o minusculas, por lo tanto si son las mismas letras nos devolverá 0 = " + cadena + " comparada con compareTo con " + cuartaCadena + " es: " );
        System.out.println("Resultado = " + resultadoMayusculasCompareTo);
        System.out.println();

        System.out.println("// .EQUALS = Si el resultado es true, estos Strings /" + cadena+"/ y /" + segundaCadena + "/ son iguales");
        System.out.println("Resultado = "+ resultadoComparacionEquals);
        System.out.println();

        System.out.println("// .EQUALSIGNORECASE = Si el resultado es true, estos Strings /" + cadena+"/ y /" + cuartaCadena + "/ son iguales sin tener en cuenta las mayusculas o minusculas");
        System.out.println("Resultado = "+ resultadoComparacionEqualsIgnoreCase);
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // .CONCAT

        String palabra1 = "Nueva";
        String palabra2 = "York";
        String concatenacionFinal = palabra1.concat(palabra2);
        System.out.println("// .CONCAT = La concatenación de " + palabra1 + " y " + palabra2 +" es " + concatenacionFinal);
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // .CONTAINS

        // Verifica si una cadena de caracteres se encuentra dentro de otra ( si un string se encuentra dentro de otro )
        // Retorna true or false dependiendo si la cadena es encontrada o no

        String palabra = "Esternocleidomastoideo";
        String cadenaQueQueremosBuscar = "terno";
        boolean resultadoMetodoContains = palabra.contains(cadenaQueQueremosBuscar);
        System.out.println("// .CONTAINS = ¿Se encuentra la cadena <"+ cadenaQueQueremosBuscar + "> dentro de la palabra <"+ palabra + "> ? ");
        System.out.println("Resultado = "+ resultadoMetodoContains);
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // .STARTSWITH & .ENDSWITH

        // Verifica si el String comienza con una cadena de caracteres específica
        // De ser veradera esa condición, nos devolverá un true, de lo contrario false

        String palabrita = "Cojonero";
        String cadenaBuscarSiEmpieza = "Cojon";
        boolean resultadoStartsWith = palabrita.startsWith(cadenaBuscarSiEmpieza);
        System.out.println("// .STARTSWITH = ¿ Empieza la palabra " +palabrita+" con la cadena "+cadenaBuscarSiEmpieza+"?");
        System.out.println("Resultado = " + resultadoStartsWith);
        System.out.println();

        String cadenaBuscarSiAcaba = "nero";
        boolean resultadoEndsWith = palabrita.endsWith(cadenaBuscarSiAcaba);
        System.out.println("// .ENDSWITH = ¿ Acaba la palabra "+palabrita+ " con la cadena " + cadenaBuscarSiAcaba+"?");
        System.out.println("Resultado = " + resultadoEndsWith);
        System.out.println();





        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // .INDEXOF

        // Encuentra el índice de la posicion de la cadena que deseamos buscar dentro del Stringç
        // RECORDAR QUE LOS INDICES EMPIEZAN POR 0 POR LO TANTO LA PRIMERA LETRA DE LA FRASE VA A ESTAR EN EL INDEX 0
        // Retorna un número entero que es la posición de la cadena dentro del string

        String frase = "El sol arde de la ostia";
        int posicionCadena = frase.indexOf("sol");
        System.out.println("// .INDEXOF = En la frase *"+frase+"* se ha buscado en que posición está la palabra luna, este es el resultado =>");
        System.out.println("Resultado en número que indica la posición de la palabra buscada en la frase es = " + posicionCadena);
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // .LASTINDEXOF

        // Encuentra la ÚLTIMA posición de la cadena que deseamos buscar en el string indicado
        // Retorna el número de la última posición de la cadena que deseamos buscar en el string indicado

        String segundaFrase = "El sol arde de la ostia, joder para el puto sol";
        int ultimaPosicion = segundaFrase.lastIndexOf("sol");
        System.out.println("// .LASTINDEXOF = En la frase * "+segundaFrase+" *se ha buscado el indice de la última posición en la que se encuentra la palabra sol");
        System.out.println("Resultado = "+ultimaPosicion);
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // .REPLACE

        // Busca una cadena dentro del String, si la encuentra la reemplaza por la cadena especificada
        // Retorna un nuevo String con la cadena reemplazada

        String frase3 = "El chico se puso se puso un calcetin de color amarillo";
        String nuevafrase3 = frase3.replace("amarillo","azul");
        System.out.println("// .REPLACE = En la frase * "+frase3+" * se va a sustituir la palabra amarillo por azul");
        System.out.println("Resultado = " + nuevafrase3);
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // .TOLOWERCASE y .TOUPPERCASE

        // .TOLOWERCASE Convierte el String a minúsculas
        // .TOUPPERCASE Convierte el String a mayúsculas

        String mayusculas = "LA TENGO ENORME";
        String minusculas = mayusculas.toLowerCase();
        System.out.println("// .TOLOWERCASE = Convertimos en minúsculas la frase : "+mayusculas);
        System.out.println("Resultado = " + minusculas);
        System.out.println();

        String vueltaMayusculas = minusculas.toUpperCase();
        System.out.println("// .TOUPPERCASE = Convertimos la frase anterior convertida completamente en minúsculas nuevamente a mayúsculas ( frase : "+minusculas+" )");
        System.out.println("Resultado = " + vueltaMayusculas);
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // .TRIM

        // Elimina espacios que pueda haber en un String tanto al principio como al final

        String frase4 = "            Estudio DAM             ";
        String trim = frase4.trim();
        System.out.println("// .TRIM = Se eliminaron los espacios en el principio y final de la frase : "+frase4);
        System.out.println("Resultado = " + trim);
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // .SUBSTRING

        // Extrae caracteres de un String entre dos índices
        // Retorna la extración de un índice a otro

        String caracteresAextraer = "Te huele la boca a culo";
        String caracteresExtraidos = caracteresAextraer.substring(10, 18);
        System.out.println("// .SUBSTRING = De la frase : * "+ caracteresAextraer + " * se extrajeron caracteres desde el índice 10 al índice 18");
        System.out.println("Resultado = "+ caracteresExtraidos);

    }
}