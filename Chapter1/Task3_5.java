public class Task3_5 {
    static double a_n(int n) {
        return (1 / (Math.pow(2, n))) + (1 / (Math.pow(3, n)));
    }

    public static double calculate(double e) {
        double sum = 0;
        int n = 1;
        while (Math.abs(a_n(n)) >= e) {
            sum = sum + a_n(n);
            n++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculate(0.01));
    }
}
