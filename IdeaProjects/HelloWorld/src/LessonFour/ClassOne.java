package LessonFour;

/**
 * Created by PC on 01.12.2017.
 */
public class ClassOne {
    public static void main(String[] args) {
        int a = 1;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(a + " ");
            }
            System.out.println();
            a = a + 1;
        }
    }
}
