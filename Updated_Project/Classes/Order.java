package Updated_Project.Classes;
import java.util.*;

// Order class
public class Order {
    private Customer customer;
    private Restaurant restaurant;
    private ArrayList<MenuItem> items;
    private Date date;
    private double totalCost;
    private String deliveryAddress;
    private String orderStatus;    
    private PaymentService payment;
    private boolean isPaid;
    private Timer timer;

    public Order(Customer customer, Restaurant restaurant, PaymentService payment) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.items = new ArrayList<>();
        this.date = new Date();
        this.totalCost = 0;
        this.deliveryAddress = "";
        this.orderStatus = "Pending";
        this.payment = payment;
        this.isPaid = false;
    }

    public Order(Customer customer, Restaurant restaurant, PaymentService payment, String deliveryAddress, String orderStatus) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.items = new ArrayList<>();
        this.date = new Date();
        this.totalCost = 0;
        this.deliveryAddress = deliveryAddress;
        this.orderStatus = orderStatus;
        this.payment = payment;
        this.isPaid = false;
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

    public boolean isPaid() {
        return isPaid;
    }

    public void pay() {
        payment.pay(this.totalCost);
        this.isPaid = true;

        // Create a new timer and schedule the task
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (!orderStatus.equals("Cancelled")) {
                    setOrderStatus("Accepted");
                }
            }
        }, 30000);
    }
    public void cancelOrder() {
        if (!orderStatus.equals("Cancelled")) {
            orderStatus = "Cancelled";
        }
    }
    
    public boolean canModify() {
        return !orderStatus.equals("Cancelled") && !isPaid;
    }

    public void modifyOrder(ArrayList<MenuItem> newItems, String newDeliveryAddress) {
        if (canModify()) {
            items = newItems;
            deliveryAddress = newDeliveryAddress;
        }
    }
    
}

