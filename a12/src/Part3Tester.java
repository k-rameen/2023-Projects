/*
Rameen Khan
May 18, 2023
Assignment 12: Recursion with Java
*/
import java.util.Scanner;

public class Part3Tester {
    public static Integer tri( int N ) {
        if (N == 0) {
            return 0;
        }
        else if (N == 1) {
            return 1;
        }
        //if odd
        else if (N % 2 == 1) {
            return 3*tri(N/2) + tri((N/2) + 1);
        }
        else {
            return 3*tri(N/2) + tri((N/2) - 1);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int N = scan.nextInt();

        Part3Tester num = new Part3Tester();
        int result = num.tri( N );

        System.out.println("T (" + N + "): " + "\n" + result);

    }

}