package app;
public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero, Cliente cliente) {
        super(agencia, numero, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Número: " + this.getNumero());
        System.out.println("Saldo: " + this.getSaldo());
    }
}

