package Updated_Project.Abstract_Classes;

// Base class for food service (restaurant or customer)
public abstract class FoodService {
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
