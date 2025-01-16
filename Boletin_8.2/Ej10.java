public class Ej10 {
    public static void main(String[] args) {

        String contraseña = "wagFsasg1";
        seguridad(contraseña);

        if (seguridad(contraseña)==true) System.out.println("True");
        if (seguridad(contraseña)==false) System.out.println("False");

    }
    public static boolean seguridad (String contraseña){

        boolean mayuscula = false;
        boolean minuscula = false;
        boolean numero = false;

        if (contraseña.length()>=8){
            char letra;
            for (int i = 0; i<contraseña.length();i++){
                letra = contraseña.charAt(i);
                if (Character.isDigit(letra)){
                    numero = true;
                }
                if (Character.isUpperCase(letra)){
                    mayuscula= true;
                }
                if (Character.isLowerCase(letra)){
                    minuscula = true;
                }
                if (numero && mayuscula && minuscula){
                    return true;
                }
    
            }
        }
                return false;


    }
}
