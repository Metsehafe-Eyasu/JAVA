package Project.Drivers;
import Project.Classes.Customer;

public class CustomerDriver {
    public static void main(String[] args) {
        // Create a new customer
        Customer customer = new Customer("John Doe", "123 Main St", "555-555-5555", "john.doe@email.com");
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Phone: " + customer.getPhoneNumber());
        System.out.println("Email: " + customer.getEmail());
    }
}

