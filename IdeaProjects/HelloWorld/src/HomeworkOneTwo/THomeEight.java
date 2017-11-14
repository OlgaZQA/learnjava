package HomeworkOneTwo;

public class THomeEight {

    public static void main(String[] args) {

        int a = 13;
        int b = 425;
        int c = 8;
        int x;

        if (a > b){
            x = a; a = b; b = x;
        }
        if (b > c){
            x = b; b = c; c = x;
        }
        if (b < a){
           x = b; b = a; a = x;
        }

        System.out.println(a + " " + b + " " + c);
    }
}
