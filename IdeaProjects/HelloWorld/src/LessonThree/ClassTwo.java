package LessonThree;

import java.util.Arrays;

/**
 * Created by PC on 01.12.2017.
 */
public class ClassTwo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 10, 9, 8, 0, 6, 5, 4, 3, 2, 1, 0};
        int tmp;
        boolean swapped = true;
        int j = 0;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr1.length - j; i++) {
                if (arr1[i] > arr1[i + 1]) {
                    tmp = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = tmp;
                    swapped = true;
                    System.out.println(Arrays.toString(arr1));
                }
            }
        }
    }
}