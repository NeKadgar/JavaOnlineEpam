import java.util.Scanner;

public class Task3_3 {
    public static int calculate(int x) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculate(100));
    }
}
