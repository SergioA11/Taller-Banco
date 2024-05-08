import base.Cliente;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Mucho Dinero");

        // Crear clientes
        Cliente cliente1 = new Cliente("105639753", "Sergio Amaya");
        Cliente cliente2 = new Cliente("2576393", "Raul Duran");
        Cliente cliente3 = new Cliente("456782", "Juan Serna");
        Cliente cliente4 = new Cliente("9632642", "Astrid Arango");

        // Adicionar cuentas
        banco.adicionarCuenta("3519-7151-6521", 1000000, "Cuenta Corriente", cliente1);
        banco.adicionarCuenta("8263-9639-1256", 235500, "Cuenta de Ahorro", cliente2);
        banco.adicionarCuenta("8272-4271-4321", 2000000, "Cuenta de Ahorro", cliente3);
        banco.adicionarCuenta("1234-4321-1324", 999999, "Cuenta Corriente", cliente4);
        
        // Consultar total de dinero en el banco
        double totalDinero = banco.consultarTotalDinero();
        System.out.println("Total de dinero en el banco: " + totalDinero);

        // Consultar cliente con mayor saldo
        String clienteMayorSaldo = banco.consultarClienteMayorSaldo();
        System.out.println("Cliente con mayor saldo: " + clienteMayorSaldo);
    }
}
