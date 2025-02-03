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