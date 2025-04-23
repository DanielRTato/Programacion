package Ej1;

public class Persoa {

    private String nome;
    private String direccion;
    private String dni;

    public Persoa(String nome, String direccion, String dni) throws DniNonValido {
        this.nome = nome;
        this.direccion = direccion;
        setDni(dni);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

   /*
    public void setDni(String dni) throws DniNonValido {
        char letraNif[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        if (dni.length() == 9 && Character.isLetter(dni.charAt(8))) {

                int numero = Integer.parseInt(dni.substring(0, 8));
                char letra = dni.charAt(8);
                if (letra == letraNif[numero % 23]) {
                    this.dni = dni;
                }

        }
    }
    */

    public void setDni(String dni) throws DniNonValido {
        if (!dni.matches("\\d{8}[A-Z]")) { // [A-HJ-NP-TV-Z] creo que excluye las letras Y Ñ U
            throw new DniNonValido("DNI introducido no válido: " + dni);
        }
        this.dni = dni;

    }
}