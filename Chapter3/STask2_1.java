public class STask2_1 {
    public static int count_space(String x) {
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (!Character.isLetterOrDigit(x.charAt(i))) {
                count++;
            } else break;
        }
        return count;
    }

    public static void main(String[] args) {
        String x = "213ewds   3123ewd";
        int spaces;
        int max = 0;
        for (int i = 0; i < x.length(); i++) {
            spaces = count_space(x.substring(i, x.length()));
            if (max < spaces) {
                max = spaces;
            }
        }
        System.out.println(max);
    }
}
