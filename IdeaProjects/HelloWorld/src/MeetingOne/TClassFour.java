package MeetingOne;

public class TClassFour {

    public static void main(String[] args) {

        int x = 7;
        int y = 10;


        System.out.println("X = " + x);
        System.out.println("Y = " + y);


        int z = x;
        x = y;
        y = z;

        System.out.println("\nX = " + x);
        System.out.println("Y = " + y);
    }
}
