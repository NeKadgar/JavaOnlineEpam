public class ATasl4_11 {
    public static String more_numbers_in(int a, int b) {
        String x = a + "";
        String y = b + "";
        if (x.length() > y.length()) {
            return x;
        } else if (x.length() < y.length()) {
            return y;
        }
        return String.format("%s and %s got same length", x, y);
    }

    public static void main(String[] args) {
        int x = 5, z = 44;
        System.out.println("more numbers in: " + more_numbers_in(x, z));
    }
}
