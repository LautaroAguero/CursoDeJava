import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("estudiante1","apellido1",0001);
        Estudiante estudiante2 = new Estudiante("estudiante2","apellido2",0002);

        Profesor profesor1 = new Profesor(100.0,1,"profesor1","apellido3",0003);
        Profesor profesor2 = new Profesor(100.0,1,"profesor2","apellido4",0004);

        Facultad facultad1 = new Facultad("facultad1",new ArrayList<Carrera>());

        Carrera carrera1 = new Carrera("carrera1",new ArrayList<Materia>());
        Carrera carrera2 = new Carrera("carrera2",new ArrayList<Materia>());

        Materia materia1 = new Materia("materia1",profesor1,new ArrayList<Estudiante>());
        Materia materia2 = new Materia("materia2",profesor1,new ArrayList<Estudiante>());



        //Punto 1
        facultad1.agregarCarrera(carrera1);

        //Punto 2
        facultad1.eliminarCarrera("carrera1");

        facultad1.agregarCarrera(carrera2);

        //Punto 4
        carrera2.agregarMaterias(materia1);
        carrera2.agregarMaterias(materia2);

        //Punto 5
        carrera2.eliminarMateria("materia1");

        //Punto 6
        carrera2.encontrarMateria("materia2");

        //Punto 7
        materia2.agregarEstudiante(estudiante1);
        materia2.agregarEstudiante(estudiante2);

        //Punto 8
        materia2.eliminarEstudiante("estudiante1");

        //punto 9
        materia2.modificarTitular(profesor2);

        //Punto 3
        materia2.agregarEstudiante(estudiante1);
        facultad1.eliminarEstudiante(estudiante1);

        System.out.println(materia1.toString());
        System.out.println(materia2.toString());
    }
}
