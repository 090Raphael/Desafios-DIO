
public class PedidoBebida implements Pedido {
    private double preco;

    public PedidoBebida(double preco) {
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public String getDescricao() {
        return "Bebida";
    }
}
