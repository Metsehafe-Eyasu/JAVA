package Project.Drivers;
import Project.Classes.*;

public class OrderDriver {
    public static void main(String[] args) {
        // Create some customers and restaurants
        Customer customer = new Customer("John Doe", "123 Main St", "555-555-5555", "john.doe@email.com");
        Restaurant restaurant = new Restaurant("Pizza Palace", "123 Main St", "555-555-5555");
        
        // Create a new order
        Order order = new Order(customer, restaurant);
        
        // Add some menu items
        MenuItem pizza = new MenuItem("Pizza", 15);
        MenuItem salad = new MenuItem("Salad", 10);
        order.addItem(pizza);
        order.addItem(salad);
        
        // Set the delivery address
        order.setDeliveryAddress("456 Main St");
        
        // Display the order details
        order.displayOrder();
    }
}
