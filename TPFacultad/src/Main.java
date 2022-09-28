import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Facultad facultad = null;
        ArrayList carreras = new ArrayList<Carrera>();
        ArrayList estudiantes = new ArrayList<Estudiante>();
        ArrayList profesores = new ArrayList<Profesor>();
        ArrayList materias = new ArrayList<Materia>();

        System.out.println("Bienvenido al sistema de generacion de Facultades");
        Boolean exitProgram = false;
        while (exitProgram == false){
            System.out.println("Seleccione una opcion: ");
            System.out.println("1: Crear una facultad");
            System.out.println("2: Crear una Carrera");
            System.out.println("3: Crear un Profesor");
            System.out.println("4: Crear Estudiantes");
            System.out.println("5: Crear Materias");
            System.out.println("6: Eliminar carrera de la facultad");
            System.out.println("7: Eliminar materia de una carrera");
            System.out.println("8: Eliminar un estudiante de la Facultad");
            System.out.println("9: Agregar carrerar a la facultad");
            System.out.println("10: Agregar materias a la carrera");
            System.out.println("11: Agregar estudiante/s a la materia");
            System.out.println("12: Encontrar materia");
            System.out.println("13: Modificar titular de una materia");

            int eleccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su eleccion"));


            switch (eleccion) {
                case 1:
                    facultad = crearFacultad();
                    break;
                case 2:
                    carreras = crearCarrera(carreras);
                    break;
                case 3:
                    profesores = crearProfesor(profesores);
                    break;
                case 4:
                    estudiantes = crearEstudiante(estudiantes);
                    break;
                case 5:
                    materias = crearMaterias(materias,estudiantes,profesores);
                    break;
                case 6:
                    eliminarCarrera(facultad);
                    break;
                case 7:
                    eliminarMateria(carreras);
                    break;
                case 8:
                    eliminarEstudiante(facultad,estudiantes);
                    break;
                case 9:
                    agregarCarrera(facultad,carreras);
                    break;
                case 10:
                    agregarMaterias(carreras,materias);
                    break;
                case 11:
                    agregarEstudiantes(materias,estudiantes);
                    break;
                case 12:
                    encontrarMateria(carreras);
                    break;
                case 13:
                    modificarTitular(profesores,materias);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + eleccion);
            }

            int toExitProgram = JOptionPane.showConfirmDialog(null,"Desea salir del programa?","Gestion de Facultad", JOptionPane.OK_CANCEL_OPTION);
            if(toExitProgram == JOptionPane.OK_OPTION) {
                exitProgram = true;
            }
        }

        /*
        Estudiante estudiante1 = new Estudiante("estudiante1","apellido1",0001);
        Estudiante estudiante2 = new Estudiante("estudiante2","apellido2",0002);

        Profesor profesor1 = new Profesor(100.0,1,"profesor1","apellido3",0003);
        Profesor profesor2 = new Profesor(100.0,1,"profesor2","apellido4",0004);

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
         */
    }

    public static Facultad crearFacultad(){
        JPanel panel1 = new JPanel();
        JTextField collegeNameField = new JTextField(10);
        panel1.add(new JLabel("Nombre:"));
        panel1.add(collegeNameField);

        int resulFacultad = JOptionPane.showConfirmDialog(null,panel1,"Creacion de Facultad: ",JOptionPane.OK_CANCEL_OPTION);
        if (resulFacultad == JOptionPane.OK_OPTION){
            Facultad facultad1 = new Facultad(collegeNameField.getText(),new ArrayList<Carrera>());
            System.out.println("Facultad "+facultad1.getNombre()+" creada");
            return facultad1;
        } else {
            return null;
        }
    }

    public static ArrayList<Carrera> crearCarrera(ArrayList<Carrera> carreras){
        JPanel panel1 = new JPanel();
        JTextField collegeNameField = new JTextField(10);
        panel1.add(new JLabel("Nombre:"));
        panel1.add(collegeNameField);

        Boolean exit = false;
        while (exit == false) {
            int resulCarrera = JOptionPane.showConfirmDialog(null,panel1,"Creacion de Carreras: ",JOptionPane.OK_CANCEL_OPTION);
            if (resulCarrera == JOptionPane.OK_OPTION){
                carreras.add(new Carrera(collegeNameField.getText(),new ArrayList<Materia>()));
                System.out.println("Carrera "+(carreras.get(carreras.size()-1))+" creada");
            }
            int toExit = JOptionPane.showConfirmDialog(null,"OK para cargar otra carrera","Carreras", JOptionPane.OK_CANCEL_OPTION);
            if(toExit == JOptionPane.CANCEL_OPTION) {
                exit = true;
            }
        }
        return carreras;
    }

    public static ArrayList<Profesor> crearProfesor (ArrayList<Profesor> profesores){
        JPanel panel3 = new JPanel();

        JTextField profesorNameField = new JTextField(5);
        JTextField profesorLastNameField = new JTextField(5);
        JTextField profesorNumberField = new JTextField(5);
        JTextField profesorPaymentField = new JTextField(5);
        JTextField profesorYearsField = new JTextField(5);


        panel3.add(new JLabel("Basico:"));
        panel3.add(profesorPaymentField);
        panel3.add(new JLabel("Antiguedad:"));
        panel3.add(profesorYearsField);
        panel3.add(new JLabel("Nombre:"));
        panel3.add(profesorNameField);
        panel3.add(new JLabel("Apellido:"));
        panel3.add(profesorLastNameField);
        panel3.add(new JLabel("Legajo:"));
        panel3.add(profesorNumberField);


        Boolean exit = false;
        while (exit == false) {
            int resulProfesor = JOptionPane.showConfirmDialog(null,panel3,"Creacion de Profesor: ",JOptionPane.OK_CANCEL_OPTION);
            if (resulProfesor == JOptionPane.OK_OPTION){
                profesores.add(
                        new Profesor(
                                Double.parseDouble(profesorPaymentField.getText()),
                                Integer.parseInt(profesorYearsField.getText()),
                                profesorNameField.getText(),
                                profesorLastNameField.getText(),
                                Integer.parseInt(profesorNumberField.getText())
                        )
                );
                System.out.println("Profesor "+(profesores.get(profesores.size()-1))+" creado");
            }

            int toExit = JOptionPane.showConfirmDialog(null,"OK para cargar otro profesor","Profesores", JOptionPane.OK_CANCEL_OPTION);
            if(toExit == JOptionPane.CANCEL_OPTION) {
                exit = true;
            }
        }
        return profesores;
    }

    public static ArrayList<Estudiante> crearEstudiante (ArrayList<Estudiante> estudiantes) {
        JPanel panel2 = new JPanel();

        JTextField studentNameField = new JTextField(5);
        JTextField studentLastNameField = new JTextField(5);
        JTextField studentNumberField = new JTextField(5);

        panel2.add(new JLabel("Nombre:"));
        panel2.add(studentNameField);
        panel2.add(new JLabel("Apellido:"));
        panel2.add(studentLastNameField);
        panel2.add(new JLabel("Legajo:"));
        panel2.add(studentNumberField);

        Boolean exit = false;
        while (exit == false) {
            int resulEstudiante = JOptionPane.showConfirmDialog(null,panel2,"Creacion de Estudiantes: ",JOptionPane.OK_CANCEL_OPTION);
            if (resulEstudiante == JOptionPane.OK_OPTION){
                estudiantes.add(new Estudiante(studentNameField.getText(),studentLastNameField.getText(),Integer.parseInt(studentNumberField.getText())));
                System.out.println("Estudiante "+(estudiantes.get(estudiantes.size()-1))+" creado");
            }

            int toExit = JOptionPane.showConfirmDialog(null,"OK para cargar otra estudiante","Estudiantes", JOptionPane.OK_CANCEL_OPTION);
            if(toExit == JOptionPane.CANCEL_OPTION) {
                exit = true;
            }
        }

        return estudiantes;
    }

    public static ArrayList<Materia> crearMaterias (ArrayList<Materia> materias,ArrayList<Estudiante> estudiantes,ArrayList<Profesor> profesores) {
        JPanel panel4= new JPanel();

        JTextField subjectNameField = new JTextField(5);
        JTextField subjectProfesorNameField = new JTextField(5);

        panel4.add(new JLabel("Nombre:"));
        panel4.add(subjectNameField);
        panel4.add(new JLabel("Profesor:"));
        panel4.add(subjectProfesorNameField);

        System.out.println("Recuerde que para cargar una materia debe de haber creado anteriormente el profesor a cargo y la lista de estudiantes");
        Boolean exit = false;
        while (exit == false) {
            int resulMateria = JOptionPane.showConfirmDialog(null,panel4,"Creacion de Materias: ",JOptionPane.OK_CANCEL_OPTION);
            if (resulMateria == JOptionPane.OK_OPTION){
                for (int i = 0; i < profesores.size(); i++) {
                    Profesor pr = (Profesor) profesores.get(i);
                    if (pr.getNombre().equals(subjectProfesorNameField.getText())) {
                        materias.add(new Materia(subjectNameField.getText(),pr,estudiantes));
                    } else {
                        System.out.println("El profesor no existe");
                    }
                }
            }

            int toExit = JOptionPane.showConfirmDialog(null,"OK para cargar otra Materia","Materias", JOptionPane.OK_CANCEL_OPTION);
            if(toExit == JOptionPane.CANCEL_OPTION) {
                exit = true;
            }
        }
        return materias;
    }

    public static void eliminarCarrera(Facultad facultad) {
        String name = JOptionPane.showInputDialog("Ingrese el nombre de la carrera que desea eliminar");
        facultad.eliminarCarrera(name);
    }

    public static void eliminarMateria(ArrayList<Carrera> carreras){
        String name = JOptionPane.showInputDialog("Ingrese el nombre de la carrera que desea eliminar");
        for (int i = 0; i < carreras.size(); i++) {
            ArrayList<Materia> mat = carreras.get(i).getMaterias();
            for (int j = 0; j < mat.size(); j++) {
                if (mat.get(j).getNombre().equals(name)) {
                    carreras.get(i).eliminarMateria("name");
                }
            }
        }
    }

    public static void eliminarEstudiante(Facultad facultad, ArrayList<Estudiante> estudiantes) {
        String name = JOptionPane.showInputDialog("Ingrese el nombre del estudiante que desea eliminar");
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante est = estudiantes.get(i);
            if(est.getNombre().equals(name)){
                facultad.eliminarEstudiante(est);
            }
        }
    }

    public static void agregarCarrera(Facultad facultad,ArrayList<Carrera> carreras){
        String name = JOptionPane.showInputDialog("Ingrese el nombre de la carrera que desea agregar, recuerde que tiene que esta creada anteriormente");
        for (int i = 0; i < carreras.size(); i++) {
            if(carreras.get(i).getNombre().equals(name)) {
                facultad.agregarCarrera(carreras.get(i));
            }
        }
    }

    public static void agregarMaterias(ArrayList<Carrera> carreras,ArrayList<Materia> materias) {
        String subjectName = JOptionPane.showInputDialog("Ingrese el nombre de la materia que desea agregar, recuerde haberla creado anteriormente");
        String degreeName = JOptionPane.showInputDialog("Ingrese el nombre de la carrera a la que desea agregar la materia, recuerde haberla creado anteriormente");
        for (int i = 0; i < carreras.size(); i++) {
            if(carreras.get(i).getNombre().equals(degreeName)) {
                for (int j = 0; j < materias.size(); j++) {
                    if(materias.get(j).getNombre().equals(subjectName)){
                        carreras.get(i).agregarMaterias(materias.get(j));
                    }
                }
            }
        }
    }

    public static void agregarEstudiantes(ArrayList<Materia> materias, ArrayList<Estudiante>estudiantes){
        String subjectName = JOptionPane.showInputDialog("Ingrese el nombre al que desea agregar los estudiantes, recuerde haber creado los estudiantes anteriormente");
        String studentName = JOptionPane.showInputDialog("Ingrese el nombre del estudiante que desea cargar a la materia, recuerde haber creado los estudiantes anteriormente");
        for (int i = 0; i < materias.size(); i++) {
            if(materias.get(i).getNombre().equals(subjectName)){
                for (int j = 0; j < estudiantes.size(); j++) {
                    if (estudiantes.get(j).getNombre().equals(studentName)) {
                        materias.get(i).agregarEstudiante(estudiantes.get(j));
                    }
                }
            }
        }
    }

    public static void encontrarMateria(ArrayList<Carrera> carreras) {
        String degreeName = JOptionPane.showInputDialog("Ingrese el nombre de la carrera donde buscara la materia, recuerde haber creado los estudiantes anteriormente");
        String subjectName = JOptionPane.showInputDialog("Ingrese el nombre de la materia que esta buscando");
        for (int i = 0; i < carreras.size(); i++) {
            if(carreras.get(i).getNombre().equals(degreeName)) {
                carreras.get(i).encontrarMateria(subjectName);
            }
        }
    }

    public static void modificarTitular(ArrayList<Profesor> profesores, ArrayList<Materia> materias) {
        String profesorName = JOptionPane.showInputDialog("Ingrese el nombre del profesor que quiere hacer titular, recuerde haber creado los estudiantes anteriormente");
        String subjectName = JOptionPane.showInputDialog("Ingrese el nombre de la materia a la que estara a cargo");

        for (int i = 0; i < materias.size(); i++) {
            if(materias.get(i).getNombre().equals(subjectName)) {
                for (int j = 0; j < profesores.size(); j++) {
                    if(profesores.get(j).getNombre().equals(profesorName)){
                        materias.get(i).modificarTitular(profesores.get(j));
                    }
                }
            }
        }
    }


}
