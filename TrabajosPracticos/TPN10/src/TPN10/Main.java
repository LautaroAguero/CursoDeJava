package TPN10;
import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int randomNumber = r.nextInt(100-0);

        boolean exit = false;

        while(exit == false) {
            int userNum = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero para continuar: "));

            if(userNum == randomNumber) {
                JOptionPane.showMessageDialog(null,"Felicitaciones Ganaste");
                exit = true;
            } else if (userNum > randomNumber) {
                JOptionPane.showMessageDialog(null,"El numero que elejiste es mayor");
            } else {
                JOptionPane.showMessageDialog(null,"El numero que elejiste es menor");
            }
        }
    }
}
