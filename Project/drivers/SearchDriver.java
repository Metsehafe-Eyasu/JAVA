package drivers;
import classes.*;
import java.util.*;

public class SearchDriver {
    public static void main(String[] args) {
        // Create some sample restaurants
        Restaurant restaurant1 = new Restaurant("Pizza Palace", "123 Main St", "555-555-5555");
        Restaurant restaurant2 = new Restaurant("Italian Bistro", "456 Main St", "555-555-5555");
        Restaurant restaurant3 = new Restaurant("Sushi Bar", "789 Main St", "555-555-5555");

        // Add the restaurants to the list
        Main.addRestaurant(restaurant1);
        Main.addRestaurant(restaurant2);
        Main.addRestaurant(restaurant3);

        // Get search term from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a search term: ");
        String searchTerm = sc.nextLine();

        // Search for restaurants
        ArrayList<Restaurant> searchResults = Main.searchRestaurants(searchTerm);
        System.out.println("Search Results: ");
        for (Restaurant restaurant : searchResults) {
            System.out.println(restaurant.getName());
        }
    }
}
