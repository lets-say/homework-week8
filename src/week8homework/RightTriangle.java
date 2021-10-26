package week8homework;
/*
Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@
 */
public class RightTriangle {
    public static void main(String[] args) {
        int r;
        int t;


        for(r=1;r<=5;r++){
            for (t=1;t<=r;t++)
                System.out.print("@");
            System.out.println("");
        }
    }
}
