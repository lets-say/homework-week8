package week8homework;
/*
Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */

import java.util.Scanner;
public class ArmstrongNumber {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num, remainder, sum = 0, temp=0;
        num=scanner.nextInt();

        temp = num;
        while (num != 0) {
            remainder = num % 10;
            num = num / 10;
            sum = sum + (remainder * remainder * remainder);
        }
        if (sum == temp) {
            System.out.println(" is an Armstrong number.");
        } else {
            System.out.println(" is not an Armstrong number.");
        }
    }
}
