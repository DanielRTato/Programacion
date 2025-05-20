package colecciones;

public  class Alumno implements Comparable<Alumno> {

    private int idAlumno;
    private String nombre, apellidos;
    private double notaMedia;
    private int edad;

    public Alumno(int idAlumno, String nombre, String apellidos, double notaMedia, int edad) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.notaMedia = notaMedia;
        this.edad = edad;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }



    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Alumno o) {
        return apellidos.compareTo(o.apellidos);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "idAlumno=" + idAlumno +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", notaMedia=" + notaMedia +
                ", edad=" + edad +
                '}';
    }

    public double getNotamedia() {
        return notaMedia;
    }
}