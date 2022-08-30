package TPN9;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JTextField sexoField = new JTextField(5);
        JTextField alturaField = new JTextField(5);

        JPanel panel = new JPanel();

        panel.add(new JLabel("Sexo (h/m) "));
        panel.add(sexoField);
        panel.add(new JLabel("Altura (cm)"));
        panel.add(alturaField);

        int result = JOptionPane.showConfirmDialog(null, panel ,"Ingrese los datos requeridos", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION){
            int altura = Integer.parseInt(alturaField.getText());
            if(sexoField.getText().equals("h")) {
                System.out.println("Su peso ideal seria: "+ (altura-110)+"kg");
            } else if (sexoField.getText().equals("m")) {
                System.out.println("Su peso ideal seria: "+(altura-120)+"kg");
            } else {
                System.out.println("Ingrese un sexo valido");
            }
        }
    }
}
