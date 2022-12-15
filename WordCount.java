import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
        int count = 1;

        for (int i = 0; i<sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != ' ') {
                count++;
            }
        }
        if (sentence.charAt(sentence.length() - 1) == ' ') {
            count--;
        }
        System.out.println("Total word count: " + count);
        input.close();
    }
}
