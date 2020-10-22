import java.util.Scanner;

public class ATask4_1 {
    public static int greatest_common_divisor(int a, int b) {
        if (b == 0)
            return a;
        return greatest_common_divisor(b, a % b);
    }

    public static int lowest_common_multiple(int a, int b) {
        return a * b / greatest_common_divisor(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A and B:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("greatest_common_divisor: " + greatest_common_divisor(a, b));
        System.out.println("lowest_common_multiple: " + lowest_common_multiple(a, b));
    }
}
