package TPN11;
import java.util.Random;

public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;


    public CuentaCorriente(double saldo, String nombreTitular) {
        Random r = new Random();

        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = r.nextLong(1000-0);
    }

    public void depositar(double monto){
        this.saldo += monto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void transferir(CuentaCorriente otro,double monto){
        if(this.getSaldo() > monto){
            otro.depositar(monto);
            this.saldo -= monto;
        }
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "saldo=" + saldo +
                ", nombreTitular='" + nombreTitular + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                '}';
    }
}
