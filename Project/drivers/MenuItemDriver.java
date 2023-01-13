package drivers;
import classes.*;

public class MenuItemDriver {
    public static void main(String[] args) {
        // Create a new menu item
        MenuItem menuItem = new MenuItem("Pizza", 15);
        System.out.println("Item Name: " + menuItem.getName());
        System.out.println("Price: $" + menuItem.getPrice());
    }
}
