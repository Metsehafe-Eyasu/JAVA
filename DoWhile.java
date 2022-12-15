import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char confirm = 'y';
        System.out.print("Enter number: ");
        int num = input.nextInt();
        do {
            System.out.print("Enter next number: ");
            num += input.nextInt();
            System.out.println("Total sum is: " + num);
            System.out.print("Would you like to continue?(y/n) ");
            String asdf =input.next();
            asdf.toLowerCase();
            confirm = asdf.charAt(0);
        } while (confirm == 'y');



        input.close();
    }
}
