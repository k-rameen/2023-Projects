/*
Rameen Khan
May 18, 2023
Assignment 12: Recursion with Java
*/
import java.util.Scanner;

public class Part2Tester {
    public int pentNum( int N ) {
        if ( N == 1 )
            return 1;
        else if ( N == 0 )
            return 0;
        else
            //formula
            return 2*pentNum(N-1) - pentNum(N-2) + 3;
    }
    public static void main ( String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scan.nextInt();

        Part2Tester num = new Part2Tester();
        //used to get N result
        int result = num.pentNum( N );

        System.out.println("P(" + N + ") is " + result );
    }
}