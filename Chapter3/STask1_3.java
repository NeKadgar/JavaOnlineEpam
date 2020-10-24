public class STask1_3 {
    public static void main(String[] args) {
        String x = "213ewds  3123ewd";
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isDigit(x.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
