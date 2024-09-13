import java.util.Scanner;
import java.text.DecimalFormat;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        df.setDecimalSeparatorAlwaysShown(true);

        System.out.println("Por favor, digite o número da Agência(ex: 1011):");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta (ex: 567-9):");
        String numeroConta = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo (ex: 1000,80):");
        double saldo = scanner.nextDouble();
        String saldoFormatado = df.format(saldo).replace('.', ',');

        String mensagem = String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.",
            nomeCliente, agencia, numeroConta, saldoFormatado
        );

        System.out.println(mensagem);
        scanner.close();
    }
}
