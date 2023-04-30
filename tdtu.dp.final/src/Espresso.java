public class Espresso extends Drinks{
    public Espresso(double cost) {
        description = "Espresso";
        this.cost = cost;
    }

    public double cost() {
        return cost;
    }
}
