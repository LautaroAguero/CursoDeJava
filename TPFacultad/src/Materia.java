import java.util.ArrayList;

public class Materia implements Informacion{
    private String nombre;
    private Profesor titular;
    private ArrayList<Estudiante> estudiantes;

    public Materia(String nombre, Profesor titular, ArrayList<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.titular = titular;
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +
                ", estudiantes=" + estudiantes.toString() +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante){
        this.estudiantes.add(estudiante);
    }

    public void eliminarEstudiante(String nombre) {
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante e = estudiantes.get(i);
            if (e.getNombre().equals(nombre)){
                estudiantes.remove(e);
            }
        }

    }

    public void modificarTitular(Profesor profesor) {
        setTitular(profesor);
    }

    @Override
    public int verCantidad() {
        return estudiantes.size();
    }

    @Override
    public String listarContenidos() {
        return estudiantes.toString();
    }
}
