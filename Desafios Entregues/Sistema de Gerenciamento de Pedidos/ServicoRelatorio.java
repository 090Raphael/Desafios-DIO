
public class ServicoRelatorio {
    private static ServicoRelatorio instancia;

    private ServicoRelatorio() {}

    public static synchronized ServicoRelatorio getInstancia() {
        if (instancia == null) {
            instancia = new ServicoRelatorio();
        }
        return instancia;
    }

    public void gerarRelatorio(Pedido pedido) {
        System.out.println("Relatório gerado para: " + pedido.getDescricao() + " - Preço: " + pedido.getPreco());
    }
}
