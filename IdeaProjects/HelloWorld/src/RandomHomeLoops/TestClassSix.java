package RandomHomeLoops;

import java.util.Scanner;

public class TestClassSix {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n == (n%2)){
            System.out.println("Your number " + n + " is odd");
        }
        else if (n >= 100){
            System.out.println("Wrong number. Enter a number that is less than 100");
        }
        else {
            System.out.println("Your number " + n + " is even");
        }
    }
}