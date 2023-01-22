/**
 * InnerInterface
 */
interface InnerInterface {
    public void eat();
    public void fly();
}

/**
 * subClass
 */
class subClass {
    public void eat() {
        System.out.println("Eating...");
    }
    
}

public class Interface {
    public static void main(String[] args) {
        subClass abc = new subClass();
        abc.eat();
    }
}
