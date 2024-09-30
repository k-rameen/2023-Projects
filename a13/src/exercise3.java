import java.util.Scanner;

public class exercise3 {

    public static int perrin(int N) {
        //perrin for 0, 1 and 2
        if (N == 0) {
            return 3;
        }
        else if (N == 1) {
            return 0;
        }
        else if (N == 2) {
            return 2;
        }
        //formula if N is any other number
        else {
            return perrin(N - 2) + perrin(N - 3);
        }
    }
    public static void main ( String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scan.nextInt();

        int result = perrin(N);

        System.out.println("Perrin(" + N + ") is " + result );
    }
}