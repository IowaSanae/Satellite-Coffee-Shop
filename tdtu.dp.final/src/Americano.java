public class Americano extends Drinks {
    public Americano(double cost) {
        description = "Americano";
        this.cost = cost;
    }

    public double cost() {
        return cost;
    }
}
