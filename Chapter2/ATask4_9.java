public class ATask4_9 {
    public static double square_of_quadrangle(int x, int y, int z, int t) {
        double p = (x + y + z + t) / 2;
        return Math.sqrt((p - x) * (p - y) * (p - z) * (p - t));
    }

    public static void main(String[] args) {
        int x = 5, z = 4, t = 6, y = 3;
        System.out.println("square_of_quadrangle: " + square_of_quadrangle(x, y, z, t));
    }
}
