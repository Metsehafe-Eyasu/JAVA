package Updated_Project.Drivers;
import Updated_Project.Classes.*;
import java.util.*;

public class OrderDriver {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("John Doe", "123 Main St", "555-555-5555", "john.doe@email.com");
        
        // Create a restaurant
        Restaurant restaurant = new Restaurant("Pizza Palace", "123 Main St", "555-555-5555");
        
        // Create a payment service
        PaymentService payment = new PaymentService();
        
        // Create a new order
        Order order = new Order(customer, restaurant, payment);

        // Add items to the order
        order.addItem(new MenuItem("Pepperoni Pizza", 15.99));
        order.addItem(new MenuItem("Cheese Pizza", 14.99));
        order.addItem(new MenuItem("Soda", 2.99));
        
        MenuItem salad = new MenuItem("Salad", 10);
        order.addItem(salad);
        
        // Set the delivery address
        order.setDeliveryAddress("456 Main St");
        
        // Display the order details
        order.displayOrder();

        // Pay for the order
        order.pay();

        // Check if the order is paid
        if (order.isPaid()) {
            System.out.println("Order is paid");
        } else {
            System.out.println("Order is not paid");
        }

        // Cancel the order
        order.cancelOrder();

        // Display the updated order
        order.displayOrder();
        System.out.println("-----------");
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                order.displayOrder();
            }
        }, 35000);
    }
}
