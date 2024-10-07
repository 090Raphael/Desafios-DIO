import org.junit.jupiter.api.Order;

public class TestOrder {
    public static void main(String[] args) {
        Order food = new FoodOS(50.0);
        Order drink = new DrinkOrder(10.0);
        
        DiscountStrategy discount = new SeasonalDiscount();
        OrderManager manager = new OrderManager(discount);
        
        // Calculando preço com desconto
        double finalPriceFood = manager.calculateFinalPrice(food);
        double finalPriceDrink = manager.calculateFinalPrice(drink);
        
        // Gerando relatórios
        ReportService reportService = ReportService.getInstance();
        reportService.generateReport(food);
        reportService.generateReport(drink);

        System.out.println("Preço final (Comida): " + finalPriceFood);
        System.out.println("Preço final (Bebida): " + finalPriceDrink);
    }
}
