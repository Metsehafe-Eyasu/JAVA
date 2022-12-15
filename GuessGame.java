import java.util.Scanner;
import java.lang.Math;
public class GuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int win = 0, loss = 0;
        int userVal, gameVal;
        char condition = 'y';
        do {
            gameVal = (int)Math.floor(Math.random()*9) + 1;

            System.out.println("Guess the number: (1 to 10)");
            userVal = input.nextInt();
            
            System.out.println("You guessed: " + userVal);
            System.out.println("The real answer was: " + gameVal);

            if (userVal == gameVal) {
                win++;
                System.out.println("You won!");
            } else {
                loss++;
                System.out.println("You lost!");
            }
            System.out.print("Enter 'y' to continue: ");
            String check = input.next();
            check.toLowerCase();
            condition = check.charAt(0);
        } while (condition == 'y');

        System.out.println("Game Conclusion: ");
        System.out.println("\t Win: " + win);
        System.out.println("\t Loss: " + loss);
        if (win > loss) {
            System.out.println("You have won the game");
        }else if(win == loss){
            System.out.println("It's a draw");
        }else{
            System.out.println("You have lost the game. Better luck next time!");
        }
        input.close();
    }
}
