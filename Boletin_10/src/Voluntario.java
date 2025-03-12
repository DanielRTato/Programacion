public class Voluntario extends Trabajador implements CalculoGastosIngresos{

    private int idade;
    private String profesion;
    private double horas;

    public Voluntario (int idade, String profesion, double horas, String direccion, String provincia, double cuota, String dataAlta, String dni, String nome){
        super(dni, nome,dataAlta);
        setIdade(idade);
        this.profesion = profesion;
        setHoras(horas);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
       if (idade >= 0 )this.idade = idade;
       else  idade = 0;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = Math.abs(horas);
    }

    @Override
    public String aCadea() {
        return super.aCadea() + " con profesión " + profesion + ", edad " + idade + ", y horas " + horas;
    }

    @Override
    public double gastosIngresos() {
        return 3;
    }
}
