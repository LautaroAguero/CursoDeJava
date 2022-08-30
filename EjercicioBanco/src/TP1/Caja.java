package TP1;

public class Caja {
    public Caja() {
    }

    public void transferencia (Cliente remitente, Cliente destinatario, double monto) {
        if (monto <= destinatario.getSaldo() ) {
            destinatario.setSaldo(destinatario.getSaldo()- monto);
            remitente.setSaldo(remitente.getSaldo()+ monto);
        } else {
            System.out.println("No posee suficiente saldo");
        }
    }

    public void deposito(Cliente destinatario, double monto){
        destinatario.setSaldo(destinatario.getSaldo()+monto);
    }

    public void compra (Cliente comprador, double monto) {
        if (monto <= comprador.getSaldo()) {
            comprador.setSaldo(comprador.getSaldo() - monto);
        } else {
            System.out.println("No posee suficiente saldo");
        }
    }
}
