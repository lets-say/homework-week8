package week8homework;
/*
5. Palindrome Number
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes.
Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
11212
 */
import java.util.Scanner;
public class PalindromeNumber {

    public static boolean isPalindrome(int number) {
        int lastdigit = number;
        int reverse = 0;
        while (lastdigit !=0){
            int remainder = lastdigit % 10;
            reverse = reverse * 10 + remainder;
            lastdigit = lastdigit/10;
        }
          if (number ==reverse){
              return true;
          }else
              return false;
    }


    public static void main(String[] args) {

        System.out.println("Please enter an integer. ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (isPalindrome(number)){
            System.out.println("number :" +number + "is a palindrome");
        }else
            System.out.println("number :" +number + "is not a palindrome");




    }
}