public class Cinnamon extends CondimentDecorator {
    private Drinks drinks;

    public Cinnamon(Drinks drinks, double cost) {
        this.drinks = drinks;
        this.cost = cost;
    }

    public String getDescription() {
        return drinks.getDescription() + ", Cinnamon - cost:  " + cost + "\n----------";
    }

    public double cost() {
        return cost + drinks.cost();
    }
}
