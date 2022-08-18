package TPN6;
import java.text.DecimalFormat;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String pattern = "#.###";
        DecimalFormat decimalFormat =  new DecimalFormat(pattern);
        double inputDeg = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de grados: "));
        double number = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
        double inputRad = Math.toRadians(inputDeg);
        JOptionPane.showMessageDialog(
                null,
                "Sin :  "+decimalFormat.format(Math.sin(inputRad))+"\n" +
                        "Cos : "+decimalFormat.format(Math.cos(inputRad))+"\n" +
                        "Tan : "+decimalFormat.format(Math.tan(inputRad))+"\n" +
                        "Arc Tan : "+decimalFormat.format(Math.atan(inputRad))+"\n" +
                        "El numero e^"+number+" es "+decimalFormat.format(Math.exp(number))+"\n"+
                        "El log de "+number+" es "+decimalFormat.format(Math.log(number))+"\n"+
                        "Pi posee un valor de: "+decimalFormat.format(Math.PI)+"\n"+
                        "El numero de Euler es : "+decimalFormat.format(Math.E)
        );
    }
}
