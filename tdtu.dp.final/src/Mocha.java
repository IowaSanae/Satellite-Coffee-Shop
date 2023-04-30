public class Mocha extends CondimentDecorator {
    private Drinks drinks;

    public Mocha(Drinks drinks, double cost) {
        this.drinks = drinks;
        this.cost = cost;
    }

    public String getDescription() {
        return drinks.getDescription() + ", Mocha - cost:  " + cost + "\n----------";
    }

    public double cost() {
        return cost + drinks.cost();
    }
}
