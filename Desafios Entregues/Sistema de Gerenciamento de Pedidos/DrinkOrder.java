
public class DrinkOrder implements Order {
    private double price;

    public DrinkOrder(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getDescription() {
        return "Bebida";
    }
}
