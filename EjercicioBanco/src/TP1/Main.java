package TP1;

import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Caja caja = new Caja();

        JCheckBox usuarioNuevo = new JCheckBox("si");
        JCheckBox usuario = new JCheckBox("no");

        JPanel panel = new JPanel();

        panel.add(new JLabel("Eres nuevo usuario? : "));
        panel.add(usuarioNuevo);
        panel.add(usuario);

        boolean finishProgram = false;

        Cliente[] clientes = new Cliente[100];

        int id = 0;

        int i = 0;

        while(finishProgram == false) {
            int result = JOptionPane.showConfirmDialog(null, panel ,"Bienvenido al banco", JOptionPane.OK_CANCEL_OPTION);

            if (result == JOptionPane.OK_OPTION) {
                if(usuario.isSelected()) {
                    id = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido ingrese su id"));
                } else {
                    String nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre: ");
                    Cliente cliente = new Cliente(nombre);
                    clientes[i] = cliente;
                    JOptionPane.showMessageDialog(null,"Su id de cliente es " +cliente.getId());
                }


            }

            i++;

            int salida = JOptionPane.showConfirmDialog(null,"Desea salir del sistema?","Sis bank",JOptionPane.OK_CANCEL_OPTION);
            if (salida == JOptionPane.OK_OPTION){
                finishProgram = true;
            }
        }

    }
}
