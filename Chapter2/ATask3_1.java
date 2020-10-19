import java.util.ArrayList;

public class ATask3_1 {
    public static void main(String[] args) {
        int k = 4;
        ArrayList<Integer> array1 = new ArrayList();
        ArrayList<Integer> array2 = new ArrayList();
        for (int i = 0; i < 20; i++) {
//            array1.add((int) (Math.random() * (16)));
//            array2.add((int) (Math.random() * (16)));
            array1.add(i);
            array2.add(i);
        }
        for (int i : array2) {
            array1.add(k,i);
            k++;
        }
        System.out.println(array1);

    }
}
