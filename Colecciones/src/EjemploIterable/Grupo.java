package EjemploIterable;

import java.util.ArrayList;
import java.util.Iterator;

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
        return alumnos.iterator();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
