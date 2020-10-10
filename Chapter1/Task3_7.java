import java.util.Scanner;

public class Task3_7 {
    public static void calculate(int m, int n) {
        for (int i = m; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите m: ");
        int m = scanner.nextInt();
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        calculate(m, n);
    }
}
