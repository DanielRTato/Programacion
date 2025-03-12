public class Miembro {

    private String dni;
    private String nome;

    public Miembro(String dni, String nome) {
        setDni(dni);
        this.nome = nome;
    }

    public String getDni() {
        return dni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDni(String nif) {
        char letraNif[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        if (nif.length() == 9 && Character.isLetter(nif.charAt(8))) {
            if (nif.charAt(8) == letraNif[Integer.parseInt(nif.substring(0, 8)) % 23]) { //o usar getInteger
                this.dni = dni;
            } else {
                throw new RuntimeException("NIF invalido");
            }
            this.dni = dni;
        } else {
            throw new RuntimeException("NIF invalido");
        }
    }


    public String aCadea() {
        return "El nombre de usuario es " + nome + " con DNI " + dni;
    }
}