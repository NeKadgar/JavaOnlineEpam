public class ATask2_3 {
    public static void main(String[] args) {
        int p = 3;
        int k = 2;
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
            System.out.println("");
        }
        System.out.println("------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == k - 1) {
                    System.out.print(arr[i][j] + "  | ");
                } else if (j == p - 1) {
                    System.out.print(arr[i][j] + "  | ");
                } else System.out.print("   | ");
            }
            System.out.println("");
        }
    }
}
