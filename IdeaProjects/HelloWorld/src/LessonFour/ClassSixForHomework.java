package LessonFour;

/**
 * Created by PC on 01.12.2017.
 */
public class ClassSixForHomework {
    public static void main(String[] args) {
        // Init arrays
        int[] arr = new int[12];
        int[] arrNegative = new int[arr.length/2];
        int[] arrPositive = new int[arr.length/2];
        // Fill array "arrNegative" with some number
        for (int i = 0; i < arrNegative.length; i++) {
            arrNegative[i] = 9;
        }
        // Print array "arrNegative" in console
        for (int i = 0; i < arrNegative.length; i++) {
            System.out.print(arrNegative[i]);
        }

        System.out.println();
        // Print array "arr" in console
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
