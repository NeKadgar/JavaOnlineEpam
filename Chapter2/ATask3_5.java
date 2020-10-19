import java.util.Arrays;

public class ATask3_5 {
    static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[index]) {
                    index = j;
                }
            }
            int x = arr[i];
            arr[i] = arr[index];
            arr[index] = x;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (16));
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sort(array)));
    }
}
