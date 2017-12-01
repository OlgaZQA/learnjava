package LessonFour;

/**
 * Created by PC on 01.12.2017.
 */
public class ClassTwo { //variant 1 of the same task
    public static void main(String[] args) {
        int a = 0;
        int counter = 1;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 7; i++) {
                if (counter % 2 == 0) {
                    a = 3;
                } else {
                    a = 0;
                }
                System.out.print(a + " ");
                counter = counter + 1;
            }
            System.out.println();
        }

    }
}
