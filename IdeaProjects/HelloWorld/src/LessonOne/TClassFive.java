package LessonOne;

/**
 * Created by PC on 01.12.2017.
 */
public class TClassFive {
    public static void main(String[] args) {
        double summ = 20000;
        double procent = 10;

        double resultSumm = summ;

        resultSumm = (resultSumm * procent / 100) / 12 + resultSumm;
        resultSumm = (resultSumm * procent / 100) / 12 + resultSumm;
        resultSumm = (resultSumm * procent / 100) / 12 + resultSumm;


        System.out.println("Result sum: " + resultSumm);
    }
}
