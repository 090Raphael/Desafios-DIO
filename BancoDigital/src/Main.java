public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Maria");

        ContaCorrente contaCorrente = new ContaCorrente(123, 456, cliente1);
        ContaPoupanca contaPoupanca = new ContaPoupanca(123, 789, cliente2);

        contaCorrente.depositar(1000);
        contaCorrente.imprimirExtrato();

        contaCorrente.transferir(200, contaPoupanca);
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
