/*
Rameen Khan
May 25, 2023
Assignment 13: Recursion with Java
*/
import java.util.Scanner;

public class exercise1 {
    //square formula
    public static int squareNum( int N ) {
        if ( N == 0 ) {
            return 0;
        }
        else if ( N == 1 ) {
            return 1;
        }
        else if (N > 0) {
            //formula
            return squareNum( N-1 ) + (2*N) - 1;
        }
        else {
            //formula
            return squareNum( N+1 ) - (2*N) + 1;
        }
    }
    //cube formula
    public static int cubeNum(int M) {
        if (M == 0) {
            return 0;
        }
        if ( M == 1 ) {
            return 1;
        }
        else if(M > 0) {
            //formula
            return cubeNum( M-1 ) + 3*(squareNum(M)) - 3*M + 1;
        }
        else {
            return cubeNum( M+1 ) - 3*(squareNum(M)) - 3*M + 1;
        }
    }
    public static void main ( String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter M: ");
        int M = scan.nextInt();

        System.out.print("Enter N: ");
        int N = scan.nextInt();

        int cubeResult = cubeNum(M);
        int squareResult = squareNum(N);

        System.out.println("Cube(" + M + ") is " + cubeResult );
        System.out.println("Square(" + N + ") is " + squareResult );
    }
}