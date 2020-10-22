public class ATask4_17 {
    public static int sum(int a, int sum) {
        if (a == 0) {
            return sum;
        }
        sum += a % 10;
        a = a / 10;
        return sum(a, sum);
    }

    public static void main(String[] args) {
        int n = 999;
        int i = 0;
        while (n != 0) {
            n -= sum(n, 0);
            i++;
        }
        System.out.println(i + " steps");
    }
}
