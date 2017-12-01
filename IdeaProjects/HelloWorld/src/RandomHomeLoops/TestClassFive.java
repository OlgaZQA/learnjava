package RandomHomeLoops;

import java.util.Scanner;

public class TestClassFive {
    public static void main(String[] args) {

        System.out.println("Enter any number");

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        System.out.println("You entered " + number);

        int sum = number * number;

            System.out.println(number + "*" + number + " is " + sum);
        }
    }
