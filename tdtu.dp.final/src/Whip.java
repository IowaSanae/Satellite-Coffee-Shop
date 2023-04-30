public class Whip extends CondimentDecorator {
    private Drinks drinks;

    public Whip(Drinks drinks, double cost) {
        this.drinks = drinks;
        this.cost = cost;
    }

    public String getDescription() {
        return drinks.getDescription() + ", Whip - cost:  " + cost + "\n----------";
    }

    public double cost() {
        return cost + drinks.cost();
    }
}
