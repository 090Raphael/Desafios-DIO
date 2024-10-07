
public class OrderManager {
    private DiscountStrategy discountStrategy;

    public OrderManager(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateFinalPrice(Order order) {
        return discountStrategy.applyDiscount(order.getPrice());
    }
}
