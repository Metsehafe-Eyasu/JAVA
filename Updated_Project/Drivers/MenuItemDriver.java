package Updated_Project.Drivers;
import Updated_Project.Classes.MenuItem;
public class MenuItemDriver {
    public static void main(String[] args) {
        // Create a new menu item
        MenuItem menuItem = new MenuItem("Pizza", 15);
        System.out.println("Item Name: " + menuItem.getName());
        System.out.println("Price: $" + menuItem.getPrice());
        System.out.println("-----------------------");
        MenuItem menuItem2 = new MenuItem("Burger", 6.99, "delicious beef stacked with cheese and becon", "fast food");
        System.out.println("Item Name: " + menuItem2.getName());
        System.out.println("Price: $" + menuItem2.getPrice());
        System.out.println("Description: " + menuItem2.getDescription());
        System.out.println("Category: " + menuItem2.getCategory());
        System.out.println((menuItem2.getAvailability())? "Available" : "Unavailable");
    }
}
