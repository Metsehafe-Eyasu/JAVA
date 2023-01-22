abstract class InnerAbstraction {
    void walk(){
        System.out.println("Walking...");
    }
    abstract void job();
}

/**
 * sub_class
 */ 
class Sub_Class extends InnerAbstraction {
    void walk(){
        System.out.println("i cant walk");
    }
    void job(){
        System.out.println("carpenter");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Sub_Class x = new Sub_Class();
        x.job();
        x.walk();
    }

}
