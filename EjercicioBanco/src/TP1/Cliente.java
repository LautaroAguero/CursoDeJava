package TP1;

public class Cliente {
    private int Id;
    private String name;
    private double saldo;
    private int i = 0;

    public Cliente(String name) {
        this.name = name;
        this.Id = i;
        i++;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
