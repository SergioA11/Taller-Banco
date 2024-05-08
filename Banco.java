import base.Cuenta;
import base.Cliente;
import java.util.ArrayList;

public class Banco {
    private String nombre;
    private ArrayList<Cuenta> cuentas;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.cuentas = new ArrayList<>(); 
    }

    public String getNombre() {
        return nombre;
    }

    public Cuenta buscarCuenta(String numero) {
        return null; 
    }

    public boolean adicionarCuenta(String numero, double saldoInicial, String tipo, Cliente titular) {

        Cuenta cuenta = new Cuenta(numero, saldoInicial, tipo, titular);
        cuentas.add(cuenta);
        return true;
    }

    public double consultarTotalDinero() {
        double total = 0;
        for (Cuenta cuenta : cuentas) {
            total += cuenta.getSaldo();
        }
        return total;
    }

    public String consultarClienteMayorSaldo(){
        double mayorSaldo = 0;
        String nombre = "";
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getSaldo() > mayorSaldo) {
                mayorSaldo = cuenta.getSaldo();
                nombre = cuenta.getTitular().getNombre();
            }
        }
        return nombre;

    }    
}