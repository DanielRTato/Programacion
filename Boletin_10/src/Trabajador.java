public class Trabajador extends Miembro {

    public Trabajador(String dni, String nome, String dataIngreso){
        super (dni,nome);
        setDataIngreso(dataIngreso);
    }

    private  String dataIngreso;


    public String aCadea(){

        return super.aCadea() + " a data de ingreso es : " + dataIngreso;
    }

    public String getDataIngreso() {
        return dataIngreso;
    }

    public void setDataIngreso(String dataIngreso) {
        if (dataIngreso.matches("\\d{2}-\\d{2}-\\d{4}")) {
        this.dataIngreso = dataIngreso;
        } else {
            throw new RuntimeException("Formato de fecha invalido. Debe ser 00-00-0000");
        }
    }
}
