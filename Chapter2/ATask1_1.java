public class ATask1_1 {
    public static int calculate(int[] array, int K) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % K == 0)
                sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 4, 5, 6, 7, 8, 9, 0, 10};
        int K = 2;
        System.out.println(calculate(A, K));
    }
}
