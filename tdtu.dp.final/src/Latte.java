public class Latte extends Drinks {
    public Latte(double cost) {
        description = "Latte";
        this.cost = cost;
    }

    public double cost() {
        return cost;
    }
}
