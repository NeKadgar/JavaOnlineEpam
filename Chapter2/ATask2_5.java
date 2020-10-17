public class ATask2_5 {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j < arr.length - i)
                    arr[i][j] = i + 1;
                else arr[i][j] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println("");
        }
    }
}
