import java.util.*;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();
        char val = 'y';
        do {
            System.out.println("Enter name: ");
            String name = input.next();
            System.out.println("Enter number: ");
            int num = input.nextInt();
            names.add(name);
            number.add(num);

            System.out.println("Enter y to continue");
            val = input.next().toLowerCase().charAt(0);
        } while (val == 'y');
        
        input.close();
    }
}
