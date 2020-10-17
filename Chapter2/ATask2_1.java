public class ATask2_1 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * (9 - (-9) + 1)) + (-9);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println("\n");
        }
        for (int j = 0; j < arr[0].length; j += 2) {
            if (arr[0][j] > arr[arr.length - 1][j]) {
                System.out.println("column " + j + ":");
                System.out.println("----------------");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("el[" + i + "][" + j + "] = " + arr[i][j]);
                }
                System.out.println("----------------");
            }
        }
    }
}
