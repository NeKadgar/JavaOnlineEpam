import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ATask3_7 {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        for (int i = 0; i < arr1.length; ++i)
            arr1[i] = (int) (Math.random() * 100);
        Arrays.sort(arr1, 0, arr1.length);
        for (int i = 0; i < arr2.length; ++i)
            arr2[i] = (int) (Math.random() * 100);
        Arrays.sort(arr2, 0, arr2.length);
        System.out.println("Original arrays:");
        printArray(arr1);
        printArray(arr2);
        System.out.println("Places to insert new elements:");
        int index = 0;
        for (int j = 0; j < arr2.length; j++) {
            while (arr2[j] > arr1[index])
                ++index;
            System.out.println(index + 1);
        }
    }
}
