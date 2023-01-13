package classes;
import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<MenuItem> menuItems;

    public Restaurant(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.menuItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addMenuItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    public void removeMenuItem(MenuItem menuItem) {
        this.menuItems.remove(menuItem);
    }

    public void displayMenu() {
        System.out.println("Menu for restaurant " + name + ":");
        for (MenuItem item : menuItems) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
    }

    public void displayRestaurantInfo() {
        System.out.println("Restaurant Name: " + name);
        System.out.println("Restaurant Address: " + address);
        System.out.println("Restaurant Phone Number: " + phoneNumber);
    }
}
