import java.util.Scanner;
public class ToBinary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int decimal = input.nextInt();
        int binary = 0;
        int num = 1;
        while(decimal != 0){
            int reminder = decimal%2;
            binary += num*reminder;
            decimal = decimal/2;
            num*=10;
            System.out.println(binary);
        }
        System.out.println(binary);
        input.close();
    }
}
