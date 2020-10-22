import java.util.Scanner;

public class ATask4_3 {
    public static double hexagon_square(double a) {
        return 3 * Math.sqrt(3) * a * a / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of a regular hexagon:");
        double a = sc.nextDouble();
        System.out.println("Square: " + hexagon_square(a));
    }
}
