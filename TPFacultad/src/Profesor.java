public class Profesor extends Persona{
    private double basico;
    private int antiguedad;


    public double calcularSaldo() {
        double sueldo = basico;
        for (int i = 0; i<antiguedad; i++) {
            sueldo *= 1.1;
        }
        return sueldo;
    };

    @Override
    public String toString() {
        return "Profesor{" +
                "basico=" + basico +
                ", antiguedad=" + antiguedad +
                ", nombre= " + super.nombre +
                ", apellido= " + super.apellido +
                ", legajo= " + super.legajo +
                '}';
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Profesor(double basico, int antiguedad,String nombre,String apellido,int legajo) {
        super(nombre, apellido, legajo);
        this.basico = basico;
        this.antiguedad = antiguedad;
    }
}
