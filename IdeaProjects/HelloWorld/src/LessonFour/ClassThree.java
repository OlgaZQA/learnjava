package LessonFour;

/**
 * Created by PC on 01.12.2017.
 */
public class ClassThree { //variant two of the same task
    public static void main(String[] args) {
        int a = 3;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 7; i++) {
                if (a == 0) {
                    a = 3;
                } else {
                    a = 0;
                }
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
