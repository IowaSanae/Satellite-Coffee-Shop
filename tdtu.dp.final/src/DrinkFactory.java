import java.util.Set;

public class DrinkFactory {

    private Database database;

    DrinkFactory(){
        this.database = Database.getInstance();
    }

    Drinks createDrink(String name, Set<String> toppingName) {
        Drinks drinks = null;
        if (name.toLowerCase().equals("cappuccino")) {
            drinks = new Cappuccino(database.getData("cappuccino"));
        } else if (name.toLowerCase().equals("latte")) {
            drinks = new Latte(database.getData("latte"));
        } else if (name.toLowerCase().equals("americano")) {
            drinks = new Americano(database.getData("americano"));
        } else if (name.toLowerCase().equals("espresso")) {
            drinks = new Espresso(database.getData("espresso"));
        } else if (name.toLowerCase().equals("macchiato")) {
            drinks = new Macchiato(database.getData("macchiato"));
        }

        for (String topping : toppingName) {
            if (topping.toLowerCase().equals("milk")) {
                drinks = new Milk(drinks, database.getData(topping));
            }
            else if (topping.toLowerCase().equals("mocha")) {
                drinks = new Mocha(drinks, database.getData(topping));
            }
            else if (topping.toLowerCase().equals("cinnamon")) {
                drinks = new Cinnamon(drinks, database.getData(topping));
            }
            else if (topping.toLowerCase().equals("whip")) {
                drinks = new Whip(drinks, database.getData(topping));
            }
        }

        return drinks;
    }
}
