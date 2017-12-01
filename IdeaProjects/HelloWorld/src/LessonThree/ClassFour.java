package LessonThree;

/**
 * Created by PC on 01.12.2017.
 */
public class ClassFour {
    public static void main(String[] args) {
        int w = 10;
        int h = 10;
        int[] image = new int[w * h];
        for (int i = 0; i < image.length; i++) {
            image[i] = 1;
        }
        int row = 1;
        int col = 1;
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                int currenyInd = x + w * y;
                if (y == row || x == col) {
                    image[currenyInd] = 0;
                }
                System.out.print(image[currenyInd] + ", ");
            }
            System.out.println();
        }
    }
}
