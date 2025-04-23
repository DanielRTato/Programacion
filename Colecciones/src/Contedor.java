public class Contedor <T>{
    private T obxecto;
    public Contedor() {}

    void gardar (T novo){
        obxecto = novo;
    }

    T extraer () {
        T res = obxecto;
        obxecto = null;
        return res;
    }


}
