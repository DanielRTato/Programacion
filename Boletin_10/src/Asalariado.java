public class Asalariado extends Trabajador implements CalculoGastosIngresos{

    private String cargo;
    private double soldo;
    private double ss;
    private double irpf;

    public Asalariado (String cargo, double soldo, double ss, double irpf, String nome, String dni, String dataIngreso){
        super(nome, dni, dataIngreso);
        this.cargo = cargo;
        setSoldo(soldo);
        setSs(ss);
        setIrpf(irpf);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSoldo() {
        return soldo;
    }

    public void setSoldo(double soldo) {
        this.soldo = Math.abs(soldo);
    }

    public double getSs() {
        return ss;
    }

    public void setSs(double ss) {
        this.ss = Math.abs(ss);
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = Math.abs(irpf);
    }

    public String aCadea(){
        return super.aCadea() + " con cargo " + cargo + ", sueldo " + soldo + ", SS " + ss + ", e IRPF " + irpf;
    }

    @Override
    public double gastosIngresos() {
        return -soldo - (soldo*15/100);
    }
}
