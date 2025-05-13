package EjemploIterable;

import java.util.Iterator;

public class Instituto {
    public static void main(String[] args) {

        Grupo dam = new Grupo("1DAM");

        dam.agregarAlumno(new Alumno("Juan","22222B", 16));
        dam.agregarAlumno(new Alumno("Ana","33333C", 17));
        dam.agregarAlumno(new Alumno("Luis","44444D", 18));
        dam.agregarAlumno(new Alumno("María","55555E", 19));
        dam.agregarAlumno(new Alumno("Carlos","66666F", 20));
        dam.agregarAlumno(new Alumno("Elena","77777G", 21));
        dam.agregarAlumno(new Alumno("WE",null, 21));



        Iterator<Alumno> iteradorGrupo = dam.iterator();

        while  (iteradorGrupo.hasNext()){
            System.out.println(iteradorGrupo.next());
        }


    }
}
