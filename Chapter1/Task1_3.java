public class Task1_3 {
    //Вычислить значение выражения по формуле (все переменные принимают действительные значения)
    public static double calculate(double x, double y) {
        return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y));
    }

    public static void main(String[] args) {
        System.out.println(calculate(4, 5));
    }
}
