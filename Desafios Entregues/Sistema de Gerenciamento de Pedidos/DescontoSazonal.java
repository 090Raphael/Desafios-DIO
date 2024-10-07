
public class DescontoSazonal implements EstrategiaDesconto {
    @Override
    public double aplicarDesconto(double preco) {
        return preco * 0.85; // 15% de desconto
    }
}
