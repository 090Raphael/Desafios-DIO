
package comportamentais;

public class ProcessadorPayPal implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento via PayPal: " + valor);
    }
}
