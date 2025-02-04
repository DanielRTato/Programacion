package src;

/**
 * pasa de binario a decimal
 */
public class Ej8 {
    public static void main(String[] args) {

        String binario="1010";
        System.out.println(binarioADecimal(binario));
    }
    public static int binarioADecimal(String binario){
        int decimal=0;
        for(int i=0;i<binario.length();i++){
            if(binario.charAt(i)=='1'){
                decimal=decimal+(int)Math.pow(2,binario.length()-1-i);
            }
            else if(binario.charAt(i)!='0'){
                return -1;
            }
        }
        return decimal;
    }
}