public class ATask1_5 {
    public static void calculate(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] > i+1)
                System.out.println(array[i]);
    }

    public static void main(String[] args) {
        int[] A = {1, -130, 4, 0, 44, -3, 3321, 43, -50};
        calculate(A);
    }
}
