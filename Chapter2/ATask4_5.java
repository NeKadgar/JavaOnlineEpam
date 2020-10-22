import java.util.Arrays;

public class ATask4_5 {
    public static int premax(int[] array) {
        Arrays.sort(array);
        return array[array.length - 2];
    }

    public static void main(String[] args) {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100));
        }
        System.out.println(Arrays.toString(array));
        System.out.println(premax(array));
    }
}
