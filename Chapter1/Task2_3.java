public class Task2_3 {
    //Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
    public static void calculate(int x1, int y1, int x2, int y2, int x3, int y3) {
        if (((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) / 2 == 0) System.out.println("Да лежат на одной прямой");
        else System.out.println("Нет не лежат на одной прямой");
    }

    public static void main(String[] args) {
        calculate(30, 60, 42, 34, 32, 34);
    }
}
