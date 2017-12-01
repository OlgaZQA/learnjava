package LessonThree;

/**
 * Created by PC on 01.12.2017.
 */
public class ClassOne {
    public static void main(String[] args) {
        int[] massive = new int[]{5, 4, 3, 2, 0};
        int[] arraySort = new int[massive.length];
        for (int i = massive.length - 1; i >= 0; i--) {
            arraySort[(massive.length - 1) - i] = massive[i];
        }
        for (int j = 0; j < arraySort.length; j++) {
            massive[j] = arraySort[j];
            System.out.println(massive[j]);
        }
    }
}
