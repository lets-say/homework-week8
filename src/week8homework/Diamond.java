package week8homework;
//Write a program in Java to display the pattern like a diamond.  While loop

import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Number of rows : ");
        int n=scanner.nextInt();
        System.out.print("Enter Symbol : ");

        char ch = scanner.next().charAt(0);
        int i=1;
        int d;
        while(i<=n)
        {
            d=1;
            while(d++<=n-i)

            {
                System.out.print(" ");

            }
            d=1;
            while(d++<=i*2-1)

            {
                System.out.print(ch);

            }

            System.out.println();
            i++;
        }
        i=n-1;
        while(i>0)
        {
            d=1;
            while(d++<=n-i)

            {
                System.out.print(" ");

            }
            d=1;
            while(d++<=i*2-1)

            {
                System.out.print(ch);

            }

            System.out.println();
            i--;
        }

    }
    
}
