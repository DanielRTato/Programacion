import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Contedor<Integer> num = new Contedor<Integer>();
        num.gardar(5);
        System.out.println(num.extraer());

        Contedor<String> cad = new Contedor<String>();
        Contedor<?> contedorParaCalquerTipo = new Contedor<>();
        cad.gardar("Hola");
        contedorParaCalquerTipo = new Contedor<Double>();
        System.out.println(cad.extraer());

        Double [] temp = new Double[5];
        temp[0]= 2.3;
        temp[1]= 152.97;
        temp[2]= 12.55;
        temp[3]= 7.32;
        temp[4]= 1.33;

        ContadorElementos<Double> t = new ContadorElementos<>(temp);
        t.apilar(2.25);
        t.apilar(33.33);

        System.out.println(t.desapilar());
        System.out.println(t.desapilar());






    }
}