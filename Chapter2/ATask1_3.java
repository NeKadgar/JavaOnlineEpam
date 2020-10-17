public class ATask1_3 {
    public static String calculate(double[] array) {
        int pos = 0;
        int neg = 0;
        int net = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                pos++;
            else if (array[i] < 0)
                neg++;
            else
                net++;
        }
        return String.format(" Positive: %d \n Negative: %d \n Zeros: %d", pos, neg, net);
    }

    public static void main(String[] args) {
        double[] A = {1, -130, 4, 0, 44, -3};
        System.out.println(calculate(A));
    }
}
