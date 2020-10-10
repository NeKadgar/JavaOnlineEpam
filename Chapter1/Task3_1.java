import java.util.Scanner;

public class Task3_1 {
    public static int calculate(int x) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число: ");
        int x = scanner.nextInt();
        System.out.println(calculate(x));
    }
}