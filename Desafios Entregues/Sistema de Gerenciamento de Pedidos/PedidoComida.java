
public class PedidoComida implements Pedido {
    private double preco;

    public PedidoComida(double preco) {
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public String getDescricao() {
        return "Comida";
    }
}
