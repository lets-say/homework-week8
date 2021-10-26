package week8homework;
/*
12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)
 */

import java.util.Scanner;

public class PrimeNumber {
    public void m1() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = scan.nextInt();
        boolean bool = false;
        for (int i = 2; i <= a / 2; ++i) {
            if (a % i == 0) {

                bool = true;
                break;
            }
        }
        if (!bool) {
            System.out.println(a + " PRIME");
        } else {
            System.out.println(a + " NOT PRIME");
        }


    }

    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();
        obj.m1();
    }
}