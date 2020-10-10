public class Task2_1 {
    public static void calculate(int alpha, int beta) {
        if (alpha + beta < 180)  {System.out.print("Треугольник существует");}
        else {System.out.println("Треугольник не существует");}
        if (alpha + beta  == 90) {System.out.println(", и он прямоугольный");}
    }

    public static void main(String[] args) {
        calculate(30, 60);
    }
}
