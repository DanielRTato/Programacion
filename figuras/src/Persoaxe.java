 public class Persoaxe {

    private String nome;
    private int vida;
    private int resistencia;
    private int forza;
    private int velocidad;
    private int experiencia;
    private String apariencia;
    private String[] habilidades;
    private String[] equipamento;

    public Persoaxe(){
        nome = "Invitado";
        vida = 3;
        resistencia = 3;
        forza = 3;
        velocidad = 3;
        experiencia = 10;
        apariencia = "Playero";
       habilidades = new String[]{"saltar", "correr", "dads", "dasfds", "sfdsf"};
        equipamento = new String[]{"as", "sd", "sdf", "gfd", "gfh"};
    }


    public Persoaxe(String nome, int vida, int resistencia, int forza, int velocidad, int experiencia, String apariencia, String[] habilidades, String[] equipamento) {

        this.vida = vida;
        this.resistencia = resistencia;
        this.forza= forza;
        this.velocidad = velocidad;
        this.experiencia = experiencia;
        this.apariencia =  apariencia;
        this.habilidades = habilidades;
        this.equipamento = equipamento;
    }

    public void setVida(int vida) {
        if (vida >= 0 && vida <= 5) {
            this.vida = vida;
        } else this.vida = 3;


    }
    public int getVida() {
            return this.vida;
    }

    public void setResistencia(int resistencia){
        if (resistencia>=0 && resistencia <=5){
            this.resistencia = resistencia;
        } else {
            System.out.println("La resistencia debe estar entre 0 y 5");
        }
    }
    public int getResistencia(){
        return this.resistencia;
    }

    public int getForza() {
        return forza;
    }
    public void setForza(int forza) {
        if (forza>=0 && forza<=5)this.forza = forza;
        else this.forza = 0;
    }

    public String[] getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String[] equipamento) {
        this.equipamento = equipamento;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }

    public String getApariencia() {
       return apariencia;
    }

    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        if (experiencia>=0 && experiencia<=10)this.experiencia = experiencia;
        else this.experiencia = 0;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if (velocidad>=0 && velocidad<=5)this.velocidad = velocidad;
        else velocidad = 2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}