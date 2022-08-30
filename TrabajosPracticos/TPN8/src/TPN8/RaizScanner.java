package TPN8;

import javax.swing.*;

public class RaizScanner {
    public RaizScanner() {

    }

    public void raizCuadrada(){
        double num = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
        System.out.println("La raiz de " + num + " es "+ Math.sqrt(num));
    }
}
