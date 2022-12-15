public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hi");
        String text = "I Love java and java loves me.";
        int ching = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'o') {
                ching = i;
            }
        }
        System.out.println(ching);
        System.out.println("Success!!!");

    }
}