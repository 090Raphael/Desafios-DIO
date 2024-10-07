
package comportamentais;

public class ProcessadorCartaoCredito implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento via Cartão de Crédito: " + valor);
    }
}
