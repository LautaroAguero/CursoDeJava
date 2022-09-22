import java.util.ArrayList;

public class Facultad implements Informacion{
    private String nombre;
    private ArrayList<Carrera> carreras;

    public Facultad(String nombre, ArrayList<Carrera> carreras) {
        this.nombre = nombre;
        this.carreras = carreras;
    }

    @Override
    public String toString() {
        return "Facultad{" +
                "nombre='" + nombre + '\'' +
                ", carreras=" + carreras.toString() +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    public void agregarCarrera(Carrera carrera) {
        this.carreras.add(carrera);
    }

    public void eliminarCarrera(String nombre) {
        for (int i = 0; i < carreras.size(); i++) {
            Carrera e = carreras.get(i);
            if (e.getNombre().equals(nombre)){
                carreras.remove(e);
            }
        }
    }

    public void eliminarEstudiante (Estudiante estudiante) {
        for (int i = 0; i < carreras.size(); i++) {
            Carrera e = carreras.get(i);
            for (int j = 0; j < e.getMaterias().size(); j++) {
                Materia m = e.getMaterias().get(j);
                for (int k = 0; k < m.getEstudiantes().size(); k++) {
                    Estudiante est = m.getEstudiantes().get(k);
                    if(est.equals(estudiante)){
                        ArrayList<Estudiante> estudiantes = m.getEstudiantes();
                        estudiantes.remove(est);
                        m.setEstudiantes(estudiantes);
                    }
                }
            }
        }
    }

    @Override
    public int verCantidad() {
        return carreras.size();
    }

    @Override
    public String listarContenidos() {
        return carreras.toString();
    }
}
