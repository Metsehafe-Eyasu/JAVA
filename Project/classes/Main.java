package classes;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Restaurant> restaurants = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create some sample customers
        Customer customer1 = new Customer("John Doe", "123 Main St", "555-555-5555", "john.doe@email.com");
        Customer customer2 = new Customer("Jane Smith", "456 Main St", "555-555-5555", "jane.smith@email.com");

        // Create some sample restaurants
        Restaurant restaurant1 = new Restaurant("Pizza Palace", "123 Main St", "555-555-5555");
        Restaurant restaurant2 = new Restaurant("Italian Bistro", "456 Main St", "555-555-5555");

        // Add some sample menu items to the restaurants
        MenuItem pizza = new MenuItem("Pizza", 15);
        MenuItem salad = new MenuItem("Salad", 10);
        MenuItem pasta = new MenuItem("Pasta", 12);
        restaurant1.addMenuItem(pizza);
        restaurant1.addMenuItem(salad);
        restaurant2.addMenuItem(pasta);

        // Print out the menu for each restaurant
        System.out.println("Menu for " + restaurant1.getName() + ":");
        restaurant1.displayMenu();
        System.out.println("Menu for " + restaurant2.getName() + ":");
        restaurant2.displayMenu();

        // Create a new order for a customer
        Order order = new Order(customer1, restaurant1);
        order.addItem(pizza);
        order.addItem(salad);
        order.setDeliveryAddress("123 Main St");
        order.displayOrder();
        
        // add the created restaurants to the list of restaurants
        addRestaurant(restaurant1);
        addRestaurant(restaurant2);
        // search for a restaurant
        System.out.println("Enter a search term: ");
        String searchTerm = sc.nextLine();
        ArrayList<Restaurant> searchResults = searchRestaurants(searchTerm);
        System.out.println("Search Results: ");
        for (Restaurant restaurant : searchResults) {
            System.out.println(restaurant.getName());
        }
    }

    public static void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public static ArrayList<Restaurant> searchRestaurants(String searchTerm) {
        ArrayList<Restaurant> searchResults = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getName().contains(searchTerm)) {
                searchResults.add(restaurant);
            }
        }
        return searchResults;
    }
}
