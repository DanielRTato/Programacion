 public class Punto {
    public double x;
    public double y;

    public Punto(){
        x = 0;
        y = 0;
    }

    public Punto (double w)throws    ExcepcionPuntoForaPrimeiroCadrante{
        setX(w);
        setY(w);
    }

    public Punto (int w)throws ExcepcionPuntoForaPrimeiroCadrante{
        setX(w);
        setY(w);
    }

    public Punto (double x, double  y)throws ExcepcionPuntoForaPrimeiroCadrante{
       setX(x);
       setY(y);
    }

    public void setX (double x) throws ExcepcionPuntoForaPrimeiroCadrante{
        if (x>=0) this.x = x;
        else throw new ExcepcionPuntoForaPrimeiroCadrante();
    }
    public double getX(){
        return x;
    }

    public void setY (double y) throws ExcepcionPuntoForaPrimeiroCadrante{
        if (y >= 0) this.y = y;
        else throw new ExcepcionPuntoForaPrimeiroCadrante();
    }
    public double getY(){
        return y;
    }


    public boolean equals (Punto outroPunto){
        if ((x ==outroPunto.x ) && (y ==outroPunto.y)) return true;
        else return false;
    }

    public String toString (){
        return "La coordenada x es : " + x + " y la coordenada y es : " + y ;
    }




}
