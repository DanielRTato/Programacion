package colecciones;

import java.util.Comparator;

public class ComparatorPorNotaDescendente  implements Comparator<Alumno> {

    @Override
    public int compare(Alumno o1, Alumno o2) {
        return -Double.compare(o1.getNotamedia(), o2.getNotamedia() );
    }
}
