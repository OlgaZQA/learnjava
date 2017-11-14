package HomeworkOneTwo;

import java.util.Scanner;  /*odd/even numbers*/

public class THomeFour {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int in = scan.nextInt();
        // int i;

        if((in%2) == 0){
            System.out.println("Your number is odd");
        }
        else {
            System.out.println("Your number is even");
        }
    }
}
