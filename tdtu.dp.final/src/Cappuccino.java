public class Cappuccino extends Drinks {
    public Cappuccino(double cost) {
        description = "Cappuccino";
        this.cost = cost;
    }

    public double cost() {
        return cost;
    }
}
