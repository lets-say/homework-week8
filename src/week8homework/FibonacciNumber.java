package week8homework;
// Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)


public class FibonacciNumber {
    public static void main(String[] args) {


        int maxNumber = 8, previousNumber = 1, nextNumber = 1;
        System.out.print("Fibonacci Series of " + maxNumber + " numbers:");

        int i = 1;
        while (i <= maxNumber) {
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }
    }
}
