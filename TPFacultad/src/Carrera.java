import java.util.ArrayList;

public class Carrera implements Informacion{
    private String nombre;
    private ArrayList<Materia> materias;

    public Carrera(String nombre, ArrayList<Materia> materias) {
        this.nombre = nombre;
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", materias=" + materias.toString() +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public void agregarMaterias(Materia materia) {
        this.materias.add(materia);
    }

    public void eliminarMateria(String nombreMateria) {
        for (int i = 0; i < materias.size(); i++) {
            Materia e = materias.get(i);
            if (e.getNombre().equals(nombre)){
                materias.remove(e);
            }
        }
    }

    public void encontrarMateria(String nombreMateria) {
        for (int i = 0; i < materias.size(); i++) {
            Materia e = materias.get(i);
            if (e.getNombre().equals(nombre)){
                System.out.println("La materia "+e.getNombre()+" se encuentra dentro de la materia");
            }
        }
    }

    @Override
    public int verCantidad() {
        return materias.size();
    }

    @Override
    public String listarContenidos() {
        return materias.toString();
    }
}
