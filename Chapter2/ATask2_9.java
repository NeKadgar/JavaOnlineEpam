public class ATask2_9 {
    public static void main(String[] args) {

        int sum = 0, sumMax = 0, columnMax = 0;
        int[][] arr = new int[3][10];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * (10));
            }
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println("");
        }

        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }
            if (sum > sumMax) {
                sumMax = sum;
                columnMax = j + 1;
            }
            sum = 0;
        }

        System.out.println("maximum sum of " + columnMax + " column = " + sumMax);
    }
}
