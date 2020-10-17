public class ATask2_7 {
    public static void main(String[] args) {
        int n = 9;
        double sum = 0;
        double[][] arr = new double[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (arr[i][j] > 0) sum += arr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("Sum of positive elements: " + sum);
    }
}
