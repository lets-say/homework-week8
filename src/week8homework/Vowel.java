package week8homework;
/*
3. Write a Java program that takes the user to provide a single character from the
 alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
 Input an alphabet: p
 Expected Output:
 Input letter is Consonant
 */
import java.util.Scanner;
public class Vowel {
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch;
        ch = sc.next().charAt(0);

       if (ch > 1) {
           System.out.println("Error!Not a character.");
       }

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Entered character " + ch + " is  Vowel");

        }
        else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Entered character " + ch + " is Consonent");

        } else
            System.out.println("Not an alphabet");



    }

    public static void main(String[] args) {
        Vowel obj=new Vowel();
        obj.input();
    }
    }


