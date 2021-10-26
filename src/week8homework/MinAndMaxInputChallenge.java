package week8homework;
/*
2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.

 */
import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n;
        boolean v;

        while (true) {
            System.out.println("Enter number ");
            n = a.nextInt();
            v = a.hasNextInt();

            if (!v) {
                break;

            }
            if (n < min) {
                min = n;

            }
            if (n > max) {
                max = n;
            }
        }
        System.out.println("min =" + min);
        System.out.println("max =" + max);

    }
}





