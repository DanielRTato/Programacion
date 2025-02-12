public class trash {
    public class Punto {
        public double x;
        public double y;

        public Punto(){
            x = 0;
            y = 0;
        }

        public Punto (double w){
            setX(w);
            setY(w);
        }

        public Punto (int w){
            setX(w);
            setY(w);
        }

        public Punto (double x, double  y){
            setX(x);
            setY(y);
        }

        public void setX (double x){
            if (x>=0) this.x = x;
            else throw new RuntimeException("Tienen que ser positivos");
        }
        public double getX(){
            return x;
        }

        public void setY (double y){
            if (y>=0) this.y = y;
            else throw new RuntimeException("Tienen que ser positivos");
        }




    }

}
