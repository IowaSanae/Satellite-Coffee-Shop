public abstract class Drinks {

    protected String description = "Unknown Drink";
    protected double cost;

    public String getDescription() {
        return description + "- cost: " + cost + "\n----------";
    }

    public abstract double cost();
}
