
public class TestePedido {
    public static void main(String[] args) {
        Pedido comida = new PedidoComida(50.0);
        Pedido bebida = new PedidoBebida(10.0);
        
        EstrategiaDesconto desconto = new DescontoSazonal();
        GerenciadorPedido gerenciador = new GerenciadorPedido(desconto);
        
        // Calculando preço com desconto
        double precoFinalComida = gerenciador.calcularPrecoFinal(comida);
        double precoFinalBebida = gerenciador.calcularPrecoFinal(bebida);
        
        // Gerando relatórios
        ServicoRelatorio servicoRelatorio = ServicoRelatorio.getInstancia();
        servicoRelatorio.gerarRelatorio(comida);
        servicoRelatorio.gerarRelatorio(bebida);

        System.out.println("Preço final (Comida): " + precoFinalComida);
        System.out.println("Preço final (Bebida): " + precoFinalBebida);
    }
}
