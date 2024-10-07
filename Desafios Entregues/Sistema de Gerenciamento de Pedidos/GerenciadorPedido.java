
public class GerenciadorPedido {
    private EstrategiaDesconto estrategiaDesconto;

    public GerenciadorPedido(EstrategiaDesconto estrategiaDesconto) {
        this.estrategiaDesconto = estrategiaDesconto;
    }

    public double calcularPrecoFinal(Pedido pedido) {
        return estrategiaDesconto.aplicarDesconto(pedido.getPreco());
    }
}
