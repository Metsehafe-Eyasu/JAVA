import java.util.Scanner;
import java.lang.Math;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] slot = new int[3];
        char user = 'y';
        do {
            for (int i = 0; i < slot.length; i++) {
                slot[i] = (int) (Math.random()*9);
                System.out.print(slot[i] + " -- ");
            }
    
            if (slot[0] == slot[1] || slot[1] == slot[2] || slot[0] == slot[2]) {
                System.out.println("Enter y to continue: ");
                user = input.next().toLowerCase().charAt(0);
            } else{
                System.out.println("You lost!");
                user = 'n';
            }
        } while (user == 'y');
        System.out.println("Thank you for playing!");
        input.close();
    }
}
