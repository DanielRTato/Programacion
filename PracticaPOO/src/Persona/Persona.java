package Persona;

public class Persona {

    private String nombre;
    private int edad;
    private String dni;

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) this.edad = edad;
        else throw new RuntimeException("Edad invalida");
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        char letraNif[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        if (dni.length() == 9 && Character.isLetter(dni.charAt(8))) {
            if (dni.charAt(8) == letraNif[Integer.parseInt(dni.substring(0, 8)) % 23]) { //o usar getInteger
                this.dni = dni;
            } else {
                throw new RuntimeException("NIF invalido");
            }
            this.dni = dni;
        } else {
            throw new RuntimeException("NIF invalido");
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                '}';
    }
}

