public class WordCount2 {
    public static void main(String[] args) {
        String sent = "   The quick brown fox     jumps over the lazy dog   ";
        String[] arr = sent.split(" ");
        int count = 0;
        for (String string : arr) {
            if (!string.equals("")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
