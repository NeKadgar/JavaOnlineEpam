import java.util.*;

public class ATask1_9 {
    public static int calculate(int[] array) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (hm.get(array[i]) != null) {
                int count = hm.get(array[i]);
                count++;
                hm.put(array[i], count);
            } else
                hm.put(array[i], 1);
        }
        System.out.println(hm);
        return Collections.max(hm.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }

    public static void main(String[] args) {
        int[] A = {4, 7, 4, 1, 3, 8, 9, 3, 7, 1, 4, 3, 3, 4, -10, 1, 1, 1, 1, 3, 4, 3, 4, -1, -1, -1, -1, -1, -1};
        System.out.println(calculate(A));
    }
}
