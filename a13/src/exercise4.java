import java.util.Scanner;

public class exercise4 {

    public static int combination(int M, int N) {
        //if M greater than N or N is negative, return 0
        if (M < N || N < 0) {
            return 0;
        }
        //else if M or N are equal to zero or each other, return 1
        else if (M == 0 || N == 0 || M == N){
            return 1;
        }
        //formula if M or N are equal to numbers greater than one and not equal to each other
        else {
            return combination(M - 1, N -1) + combination(M - 1, N);
        }
    }
    public static void main ( String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter M: ");
        int M = scan.nextInt();

        System.out.print("Enter N: ");
        int N = scan.nextInt();

        int result = combination(M, N);

        System.out.println("Comb(" + M + "," + " N) is " + result);
    }
}