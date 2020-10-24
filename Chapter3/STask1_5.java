public class STask1_5 {
    public static void main(String[] args) {
        String x = "213ewds   3123ewd";
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            x = x.trim().replaceAll(" +", " ");
        }
        System.out.println(x);
    }
}
