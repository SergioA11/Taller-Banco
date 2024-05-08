package base;

public class Cuenta {
    private String numero;
    private double saldo;
    private String tipo;
    private Cliente titular;

    public Cuenta(String numero, double saldoInicial, String tipo, Cliente titular) {
        this.numero = numero;
        this.saldo = saldoInicial;
        this.tipo = tipo;
        this.titular = titular;
    }

    public Cuenta(String numero, String tipo, Cliente titular) {
        this(numero, 0, tipo, titular);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void consignar(double cantidad) {
        saldo += cantidad;
    }

    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
}
