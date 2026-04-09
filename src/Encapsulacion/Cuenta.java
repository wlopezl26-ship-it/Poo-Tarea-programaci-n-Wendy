package Encapsulacion;

public class Cuenta {

	private String titular;
    private double saldo;
    private int pin;
    
    public Cuenta(String titular, double saldo, int pin) {
        this.titular = titular;
        this.saldo = saldo;
        this.pin =pin;
    }

    public void depositar(double monto) {
        this.saldo += monto;
        System.out.println("Depositado: $" + monto);
    }

    public void retirar(double monto, int pinIngresado) {
        if (pinIngresado == this.pin) {
            if (monto <= saldo) {
                saldo -= monto;
                System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("PIN incorrecto. Acceso denegado.");
        }
    }

    public double getSaldo() { return saldo; }
    public String getTitular() { return titular; }
	
}
