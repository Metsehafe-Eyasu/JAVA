import java.util.*;

public class AscendingOrder {
    public static void main(String[] args){
        int a = 2, b = 3, c = 1;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if(a >= b && a >= c){
            if(b >= c){
                System.out.println("The order is : " + c + " -> " + b + " -> " + a);
            }
            else{
                System.out.println("The order is : " + b + " -> " + c + " -> " + a);
            }
        }
        else if(b >= a && b >= c){
            if(a >= c){
                System.out.println("The order is : " + c + " -> " + a + " -> " + b);
            }
            else{
                System.out.println("The order is : " + a + " -> " + c + " -> " + b);
            }
        }
        else{
            if(b >= a){
                System.out.println("The order is : " + a + " -> " + b + " -> " + c);
            }
            else{
                System.out.println("The order is : " + b + " -> " + a + " -> " + c);
            }
        }
        input.close();
    }
}
