package LessonFour;

/**
 * Created by PC on 01.12.2017.
 */
public class ClassFour {
    public static void main(String[] args) {
        int a = 1;
        int stringLen = 17;
        int rows = 9;
        int x = 0;
        int spacesCount = (stringLen - 1)/2;
        for (int j = 0; j < rows; j++) {
            a = 1;
            for (int i = 0; i < stringLen; i++) {
                x = a - stringLen/2 - 1;
                x = Math.abs(x) + 1;
                if (i < spacesCount || i > (stringLen - spacesCount - 1)) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print(x + " ");
                }
                a++;
            }
            System.out.println();
            spacesCount = spacesCount - 1;
        }
    }
}
