package LessonFour;

/**
 * Created by PC on 01.12.2017.
 */
public class ClassFive {
    public static void main(String[] args) {
        int m = 0;
        int h = 0;
        for (int j = 0; j < 24; j++) {
            for (int i = 0; i < 60; i++) {
                String hForPrint = h + "";
                String mForPrint = m + "";
                if (m < 10) {
                    mForPrint = "0" + mForPrint;
                }
                if (h < 10) {
                    hForPrint = "0" + hForPrint;
                }
                System.out.println(hForPrint + ":" + mForPrint);
                m++;
            }
            m = 0;
            h++;
        }
    }
}
