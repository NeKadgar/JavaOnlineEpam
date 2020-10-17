public class ATask2_13 {
    public static void main(String[] args) {
        int f;
        int[][] arr = new int[10][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * (16));
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("sort ascending:");
        for (int j = 0; j < arr[0].length; j++) { //sort ascending
            for (int i  = 0; i < (arr.length - 1); i++) {
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[k][j] < arr[i][j]) {
                        f = arr[i][j];
                        arr[i][j] = arr[k][j];
                        arr[k][j] = f;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("sort desc:");
        for (int j = 0; j < arr[0].length; j++) { //sort desc
            for (int i  = 0; i < (arr.length - 1); i++) {
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[k][j] > arr[i][j]) {
                        f = arr[i][j];
                        arr[i][j] = arr[k][j];
                        arr[k][j] = f;
                    }
                }
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
