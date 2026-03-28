package Encapsulacion;

public class Cuenta {

	String titular;
    double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        this.saldo += monto;
        System.out.println("Depositado: $" + monto);
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            this.saldo -= monto;
            System.out.println("Retirado: $" + monto);
        } else {
            System.out.println("Error: Saldo insuficiente para retirar $" + monto);
        }
    }

    public double getSaldo() { return saldo; }
    public String getTitular() { return titular; }
	
}
