package compiled;
import java.util.*;

abstract class FoodService {
    private String name;
    private String address;
    private String phone;

    public FoodService(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}

class Customer extends FoodService {
    private String email;

    public Customer(String name, String address, String phone, String email) {
        super(name, address, phone);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}

class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean availability;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.description = "";
        this.category = "";
        this.availability = true;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void displayItem() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);
        System.out.println("Availability: " + availability);
    }
}

class Restaurant extends FoodService {
    private ArrayList<MenuItem> menu;

    public Restaurant(String name, String address, String phone) {
        super(name, address, phone);
        menu = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public void displayMenu() {
        for (MenuItem item : menu) {
            System.out.println(item.getName() + ": $" + item.getPrice());
        }
    }
    public void displayRestaurantInfo() {
        System.out.println("Restaurant Name: " + getName());
        System.out.println("Restaurant Address: " + getAddress());
        System.out.println("Restaurant Phone Number: " + getPhone());
    }
}

interface Payment {
    public void pay(double amount);
    public void refund(double amount);
}

class PaymentService implements Payment {
    public void pay(double amount) {
        // code to process payment
        System.out.println("Payment of $" + amount + " processed successfully!");
    }

    public void refund(double amount) {
        // code to process refund
        System.out.println("Refund of $" + amount + " processed successfully!");
    }
}

class Order {
    private Customer customer;
    private Restaurant restaurant;
    private ArrayList<MenuItem> items;
    private Date date;
    private double totalCost;
    private String deliveryAddress;
    private String orderStatus;    
    private PaymentService payment;

    public Order(Customer customer, Restaurant restaurant, PaymentService payment) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.items = new ArrayList<>();
        this.date = new Date();
        this.totalCost = 0;
        this.deliveryAddress = "";
        this.orderStatus = "Pending";
        this.payment = payment;
    }

    public void addItem(MenuItem item) {
        this.items.add(item);
        this.totalCost += item.getPrice();
    }

    public void removeItem(MenuItem item) {
        this.items.remove(item);
        this.totalCost -= item.getPrice();
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    public Restaurant getRestaurant(){
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant){
        this.restaurant = restaurant;
    }

    public Date getDate() {
        return date;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String address) {
        deliveryAddress = address;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void displayOrder() {
        System.out.println("Order Details:");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Restaurant: " + restaurant.getName());
        System.out.println("Date: " + date);
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Items: ");
        for (MenuItem item : items) {
            System.out.println(item.getName() + ": $" + item.getPrice());
        }
        System.out.println("Total Cost: " + totalCost);
    }

    public void pay() {
        payment.pay(this.totalCost);
    }
}

