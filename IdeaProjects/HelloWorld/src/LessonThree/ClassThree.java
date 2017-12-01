package LessonThree;

/**
 * Created by PC on 01.12.2017.
 */
public class ClassThree {
    public static void main(String[] args) {
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 10, 9, 8, 0, 6, 5, 4, 3, 2, 1, 0};
        int[] arr3 = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            arr3[i] = (int) Math.pow(arr2[i], 2);
            System.out.println("Элемент масива " + arr2[i] + " в степени два = " + arr3[i]);
        }
        for (int i = 0; i < arr3.length; i++){
            arr2[i] = arr3[i];
        }
    }
}
