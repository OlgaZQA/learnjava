package LessonTwo;

public class AddClassOne {

    public static void main(String[] args) {

     /* int a = 5;
        int b = 10;
        int c;

         c = a;
         a = b;
         b = c;

        System.out.println(a);
        System.out.println(b);*/


        int a = 5;
        int b = 10;

        a = b + a;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
