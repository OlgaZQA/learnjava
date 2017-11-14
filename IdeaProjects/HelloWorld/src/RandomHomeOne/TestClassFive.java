package RandomHomeOne;

import java.util.Scanner;

public class TestClassFive {
    public static void main(String[] args) {

        System.out.println("Enter any number");

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        System.out.println("You entered " + number);

        int sum = 0;
        for (int i = 1; i <= number; i++){
            sum = sum + i;

            System.out.println("The summ of these numbers is " + sum);
        }
    }
}