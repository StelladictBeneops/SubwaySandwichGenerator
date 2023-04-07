import java.util.Random;

public class SubwaySandwichGenerator {
    public static void main(String[] args) {
        String[] breads = {
            "Italian Bread",
            "Italian Herbs & Cheese Bread",
            "9-Grain Wheat Bread",
            "9-Grain Honey Oat Bread",
            "White Bread",
            "Flatbread",
            "Parmesan Oregano Bread",
            "Sourdough Bread",
            "Multigrain Flatbread",
            "Spinach Wrap"
        };
        String[] meats = {
            "Veggie Patty",
            "Roasted Chicken Breast",
            "Black Forest Ham",
            "Grilled Chicken",
            "Rotisserie-Style Chicken",
            "Oven Roasted Turkey",
            "Genoa Salami",
            "Meatballs",
            "Roast Beef",
            "Tuna",
            "Vegan Patty"
        };
        String[] toppings = {
            "Hickory-smoked Bacon",
            "Pepperoni",
            "Capicola",
            "Sliced American Cheese",
            "Sliced Pepper Jack Cheese",
            "Sliced Provolone Cheese",
            "Shredded Monterey Cheddar Cheese",
            "Shredded Mozzarella Cheese",
            "Fresh Mozzarella Slices",
            "Parmesan Cheese",
            "Lettuce",
            "Spinach",
            "Tomatoes",
            "Pickles",
            "Green Peppers",
            "Red Onions",
            "Cucumbers",
            "Black Olives",
            "Jalapenos",
            "Banana Peppers",
            "Black Pepper",
            "Salt"
        };
        String[] sauces = {
            "Baja Chipotle Southwest Sauce",
            "Barbecue Sauce",
            "Buffalo Sauce",
            "Caesar",
            "Creamy Sriracha",
            "Giardiniera",
            "Honey Mustard",
            "Hot Pepper Relish",
            "Lite Mayonnaise",
            "Mayonnaise",
            "Parmesan Vinaigrette",
            "Oil",
            "Oil & Vinegar",
            "Peppercorn Ranch Sauce",
            "Red Wine Vinegar",
            "Sweet Onion Sauce, Fat Free",
            "Sweet Onion Teriyaki Sauce"
        };
        
        Random rand = new Random();
        int breadIndex = rand.nextInt(breads.length);
        String bread = breads[breadIndex];
        
        int meatIndex = rand.nextInt(meats.length);
        String meat = meats[meatIndex];
        
        int numVeggies = rand.nextInt(toppings.length) + 1;
        String[] veggies = new String[numVeggies];
        for (int i = 0; i < numVeggies; i++) {
            int veggieIndex = rand.nextInt(toppings.length);
            veggies[i] = toppings[veggieIndex];
        }
        
        int sauceIndex = rand.nextInt(sauces.length);
        String sauce = sauces[sauceIndex];
        
        boolean hasGuacamole = rand.nextBoolean();

        System.out.println("Here's your Subway sandwich:");
        System.out.println("Bread: " + bread);
        System.out.println("Meat: " + meat);
        System.out.print("Veggies: ");
        for (String veggie : veggies) {
            System.out.print(veggie + " ");
        }
        System.out.println();
        System.out.println("Sauce: " + sauce);
        if (hasGuacamole) {
            System.out.println("Guacamole: Yes");
        } else {
            System.out.println("Guacamole: No");
        }
    }
}
