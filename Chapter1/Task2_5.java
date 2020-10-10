public class Task2_5 {
    public static void calculate(int x) {
        if (x <= 3) System.out.println(Math.pow(x, 2) - 3 * x + 9);
        else System.out.println(1 / (Math.pow(x, 3) + 6));
    }

    public static void main(String[] args) {
        calculate(30);
    }
}
