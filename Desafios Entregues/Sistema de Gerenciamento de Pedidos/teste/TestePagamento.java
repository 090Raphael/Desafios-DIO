
package teste;

import comportamentais.ProcessadorCartaoCredito;
import comportamentais.ProcessadorPayPal;
import criacionais.RelatorioTransacao;
import estruturais.ServicoPagamento;

public class TestePagamento {
    public static void main(String[] args) {
        ProcessadorCartaoCredito cartao = new ProcessadorCartaoCredito();
        ProcessadorPayPal paypal = new ProcessadorPayPal();

        RelatorioTransacao relatorio = RelatorioTransacao.getInstancia();

        ServicoPagamento servicoCartao = new ServicoPagamento(cartao);
        servicoCartao.processarPagamento(100.0);
        relatorio.registrarTransacao("Pagamento via cartão de crédito: 100.0");

        ServicoPagamento servicoPaypal = new ServicoPagamento(paypal);
        servicoPaypal.processarPagamento(50.0);
        relatorio.registrarTransacao("Pagamento via PayPal: 50.0");
    }
}
