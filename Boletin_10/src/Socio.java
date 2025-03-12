public class Socio extends Miembro implements CalculoGastosIngresos{

    private String direccion;
    private String provincia;
    private double cuota;
    private String dataAlta;

    public Socio (String direccion, String provincia, double cuota, String dataAlta, String dni, String nome){
        super(dni,nome);
        this.direccion = direccion;
        this.provincia = provincia;
        this.cuota = cuota;
       setDataAlta(dataAlta);
    }

    public void setDataAlta(String dataAlta) {
        if (dataAlta.matches("\\d{2}-\\d{2}-\\d{4}")) {
            this.dataAlta = dataAlta;
        } else {
            throw new RuntimeException("Formato de fecha invalido. Debe ser 00-00-0000");
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
       if (cuota > 0.0 )this.cuota = cuota;
       else cuota = 0;
    }

    public String getDataAlta() {
        return dataAlta;
    }

    @Override
    public double gastosIngresos() {
        return cuota;
    }

    @Override
    public String aCadea() {
        return super.aCadea() + " con dirección " + direccion + ", provincia " + provincia + ", cuota " + cuota + ", y fecha de alta " + dataAlta;
    }
}
