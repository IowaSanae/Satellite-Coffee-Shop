public class Milk extends CondimentDecorator {
    private Drinks drinks;

    public Milk(Drinks drinks, double cost) {
        this.drinks = drinks;
        this.cost = cost;
    }

    public String getDescription() {
        return drinks.getDescription() + ", Milk - cost:  " + cost + "\n----------";
    }

    public double cost() {
        return cost + drinks.cost();
    }
}
