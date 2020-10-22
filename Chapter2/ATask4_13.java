import java.util.InputMismatchException;
import java.util.Scanner;

public class ATask4_13 {
    public static boolean is_twins(int a) {
        int k = 1, kol = 0;
        while (k <= Math.sqrt(a)) {
            if (a % k == 0) {
                kol++;
            }
            k++;
        }
        return a != 1 && kol + 1 == 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter positive integer n > 2:");
            n = sc.nextInt();
        } while (n < 2);
        System.out.println("--------------");
        int i = n;
        while (i < 2 * n - 1) {
            if (is_twins(i) && is_twins(i + 2)) {
                System.out.println(i + " " + (i + 2));
                i += 2;
            } else i++;
        }
    }
}