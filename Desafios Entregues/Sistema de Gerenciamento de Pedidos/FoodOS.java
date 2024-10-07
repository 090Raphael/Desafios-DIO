
public class FoodOS implements Order {
    private double price;

    public FoodOS(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getDescription() {
        return "Comida";
    }
}
