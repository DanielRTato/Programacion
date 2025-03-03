public class Consumo {

    private int km; //km recorridos polo coche
    private int litros; // litros consumidos de combustible
    private int vMedvelocidade; // media de velocidad
    private int pGas; // prezo da gasolina

    public Consumo(){
        // constructor sin parametros
    }

    public Consumo(int km, int litros, int vMedvelocidade, int pGas){

        this.km = km;
        this.litros = litros;
        this.vMedvelocidade = vMedvelocidade;
        this.pGas = pGas;
    }

    public int getTempo() {
        if (vMedvelocidade > 0  ){
            return km / vMedvelocidade;
        }
        else {
            throw new IllegalArgumentException("La velocidad debe ser mayor a 0");
        }
    }

    public float consumoMedio() {
        if (km > 0) {
            return (litros / (float) km) * 100;
        } else {
            throw new IllegalArgumentException("Los kilómetros recorridos deben ser mayores a 0");
        }
    }

    public float consumoEuros () {
        if (pGas > 0) {
            return pGas * consumoMedio();
        }
        else {
            throw new IllegalArgumentException("el precio debe ser mayor a 0");
        }

    }

    public void setKms(int km){
        if (km > 0){
            this.km = km;
        }
        else throw new RuntimeException("Los km deben ser mayor a 0");
    }

    public void setLitros (int litros){
        if (litros > 0){
            this.litros = litros;
        }
        else throw new RuntimeException("Los litros deben ser mayor a 0");
    }

    public void setvMed(int vMedvelocidade){
        if (vMedvelocidade > 0){
            this.vMedvelocidade = vMedvelocidade;
        }else {
            throw new RuntimeException("Los media de la velocidad deben ser mayor a 0");
        }
    }

    public void setPGas(int pGas){
     if (pGas > 0){
         this.pGas = pGas;
     }else{
         throw new RuntimeException("Los km deben ser mayor a 0");
     }
    }








    }
