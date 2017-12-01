package LessonTwo;

public class AddClassThree {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        int base = 20;

        int c = a - base;
        int d = b - base;

        if (a < b) {
            System.out.println("B " + b + " is closer to " + base);
        }else {
            System.out.println("A " + a + " is closer to " + base);

        }
    }
}
