package TPN11;

public class Main {

    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente(100,"TestName1");
        CuentaCorriente cuenta2 = new CuentaCorriente(100,"TestName2");

        cuenta1.transferir(cuenta2,50);

        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
    }
}
