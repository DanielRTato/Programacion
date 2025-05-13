package EjemploIterable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Configurar el método next() para que deveulva alumnos que tengan NIA
 */
public class Grupo implements Iterable <Alumno>{

    private String nombre;
    private ArrayList<Alumno> alumnos;

    public Grupo(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno (Alumno a) {
        alumnos.add(a);
    }

    @Override
    public Iterator<Alumno> iterator() {
        return new IteratorGrupo();
    }

    private class IteratorGrupo implements Iterator<Alumno> {
        private int posicion = 0;

        @Override
        public boolean hasNext() {
            while (posicion < alumnos.size() && alumnos.get(posicion).getNia() == null){
                posicion++;
            }
            return posicion < alumnos.size();
        }

        @Override
        public Alumno next() {
                return alumnos.get(posicion++);

        }
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
