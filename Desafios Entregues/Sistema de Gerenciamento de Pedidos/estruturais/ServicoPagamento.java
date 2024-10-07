package estruturais;

import comportamentais.ProcessadorPagamento;

public class ServicoPagamento {
    private final ProcessadorPagamento processador;

    public ServicoPagamento(ProcessadorPagamento processador) {
        this.processador = processador;
    }

    public void processarPagamento(double valor) {
        processador.processar(valor);
    }
}
