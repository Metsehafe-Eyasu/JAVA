package Updated_Project.Drivers;
import Updated_Project.Classes.Restaurant;
import Updated_Project.Classes.MenuItem;

public class RestaurantDriver {
    public static void main(String[] args) {
        // Create a new restaurant
        Restaurant restaurant = new Restaurant("Pizza Palace", "123 Main St", "555-555-5555");
        
        // Add some menu items
        MenuItem pizza = new MenuItem("Pizza", 15);
        MenuItem salad = new MenuItem("Salad", 10);
        restaurant.addMenuItem(pizza);
        restaurant.addMenuItem(salad);
        
        // Display the menu
        restaurant.displayMenu();
        restaurant.displayRestaurantInfo();
    }
}
