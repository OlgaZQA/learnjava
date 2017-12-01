package LessonOne;

public class TClassThree {

    public static void main(String[] args) {

        double a = 100;
        double b = 70;
        double c = 60;


        double p = (a + b + c) / 2;

        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println(s);
    }
}
