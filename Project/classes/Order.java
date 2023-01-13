package classes;
import java.util.ArrayList;
import java.util.Date;

public class Order {
    private ArrayList<MenuItem> items;
    private Customer customer;
    private Restaurant restaurant;
    private Date date;
    private double totalCost;
    private String deliveryAddress;
    private String orderStatus;
    
    public Order(Customer customer, Restaurant restaurant) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.date = new Date();
        this.items = new ArrayList<>();
        this.totalCost = 0;
        this.deliveryAddress = "";
        this.orderStatus = "Pending";
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

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
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
            System.out.println(item.getName() + " - " + item.getPrice());
        }
        System.out.println("Total Cost: " + totalCost);
    }
}
