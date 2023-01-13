package drivers;
import classes.*;

public class RestaurantDriver {
    public static void main(String[] args) {
        // Create a new restaurant
        Restaurant restaurant = new Restaurant("Pizza Palace", "123 Main St", "555-555-5555");
        System.out.println("Restaurant Name: " + restaurant.getName());
        System.out.println("Address: " + restaurant.getAddress());
        System.out.println("Phone: " + restaurant.getPhoneNumber());
        
        // Add some menu items
        MenuItem pizza = new MenuItem("Pizza", 15);
        MenuItem salad = new MenuItem("Salad", 10);
        restaurant.addMenuItem(pizza);
        restaurant.addMenuItem(salad);
        
        // Display the menu
        restaurant.displayMenu();
    }
}
