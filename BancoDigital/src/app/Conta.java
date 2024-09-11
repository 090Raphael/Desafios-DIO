package app;

public abstract class Conta {
    private final int agencia;
    private final int numero;
    private double saldo;
    private final Cliente cliente;

    public Conta(int agencia, int numero, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        if (saldo >= valor) {
            saldo -= valor;
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferir.");
        }
    }

    public void imprimirExtrato() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numero);
        System.out.println("Saldo: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}