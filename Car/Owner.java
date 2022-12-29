package Car;

import java.util.ArrayList;

public class Owner {
    String name;
    ArrayList<Car> cars = new ArrayList<>();

    public void displayCars() {
        for (Car car : cars) {
            System.out.println("Owner: " + car.owner);
            System.out.println("Model : " + car.model);
            System.out.println("Engine CC: " + car.engineCC);
            System.out.println("Manufacturer: " + car.manufacturer);
        }
    }
}
