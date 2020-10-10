public class Task1_1 {
    //Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
    public static float calculate(float a, float b, float c) {
        return ((a - 3) * b / 2) + c;
    }

    public static void main(String[] args) {
        System.out.println(calculate(4, 5, 6));
    }
}