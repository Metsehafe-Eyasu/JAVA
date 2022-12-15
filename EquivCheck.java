import java.util.*;

public class EquivCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> ListOne = new ArrayList<>();
        ArrayList <Integer> ListTwo = new ArrayList<>();
        int size;
        System.out.print("Size of first array: ");
        size = input.nextInt();
        System.out.println("Input the values of first array: ");
        for (int i = 0; i < size; i++) {
            ListOne.add(input.nextInt());
        }
        System.out.print("Size of second array: ");
        size = input.nextInt();
        System.out.println("Input the values of second array: ");
        for (int i = 0; i < size; i++) {
            ListTwo.add(input.nextInt());
        }
        
        if (ListOne.size() != ListTwo.size()) {
            System.out.println("Arrays are not identical");
            input.close();
            return;
        }

        for (Integer listOneVal : ListOne) {
            boolean checker = false;
            for (Integer listTwoVal : ListTwo) {
                if (listOneVal != listTwoVal) {
                    checker = false;
                }else{
                    checker = true;
                    ListTwo.remove(Integer.valueOf(listTwoVal));
                    break;
                }
            }
            if (!checker) {
                System.out.println("arrays are not identical");
                input.close();
                return;
            }    
        }
        System.out.println("Arrays are identical");
        input.close();
    }
}
