 public class Personaje {

      String nombre; //nombre del pj
      int vida;  //las vidas

    //Contructor por defecto
    public Personaje(){
        this.nombre  = "Kakarot";
        this.vida = 1000;
    }

    //Constructor que pone nombre
    public Personaje (String nuevoNombre){
        this.nombre = nuevoNombre;
        this.vida = 10000;
    }

    public int perderVida (int dano){
       if (dano<1001 && dano>=0){
           this.vida= vida-dano;
            return vida;
       }
        else{
            throw new RuntimeException("Valor no valido");
        }
    }

    public int getVida(){
        return vida;
    }

    public void setVida(int vida){
        this.vida=vida;
    }



}
