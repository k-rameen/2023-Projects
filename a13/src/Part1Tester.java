/*
Rameen Khan
May 18, 2023
Assignment 12: Recursion with Java
*/
import java.util.Scanner;

public class Part1Tester {
    public int squareNum( int N ) {
        if ( N == 1 )
            return 1;
        else
            //formula
            return squareNum( N-1 ) + (2*N) - 1;
    }
    public static void main ( String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scan.nextInt();

        Part1Tester num = new Part1Tester();
        //used to get N result
        int result = num.squareNum( N );
        //makes square(1) = 1
        int result2 = num.squareNum( 1 );

        System.out.println("Square(" + N + ") is " + result );
        System.out.println("Square(1) is " + result2 );
    }
}