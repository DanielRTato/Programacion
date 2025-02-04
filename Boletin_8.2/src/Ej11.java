package src;

/**
 * Escribe a función que permita formatear de nomes. A función ten que eliminar
 * os espazos en branco e poñer en maiúsculas o primeiro caracter d o nome e apelido
 * pasado como parámetro.
 * Finalmente retornará unha cadea co nome e apelidos co formato solicitado.
 */
public class Ej11 {
    public static void main(String[] args) {
        String  nombre = "paco gutUerrez";
        System.out.println(formatearNombre(nombre));
    }
    public static String formatearNombre(String nombre){
        String nombreFormateado = "";
        nombre=nombre.toLowerCase();
        //pasar nombre a array de caracteres
        char[] arrayNombre = nombre.toCharArray();
        //recorrer array
        for(int i=0;i<arrayNombre.length;i++){
            //si es la primera letra o la letra anterior es un espacio
            if(i==0 || arrayNombre[i-1]==' '){
                //pasar a mayuscula
                arrayNombre[i]=Character.toUpperCase(arrayNombre[i]);
            }
            //añadir letra al nombre formateado
            nombreFormateado=nombreFormateado+arrayNombre[i];
        }
        nombreFormateado=nombreFormateado.replace(" ","");
        return nombreFormateado;

    }
}