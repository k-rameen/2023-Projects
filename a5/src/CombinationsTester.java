import java.util.*;
class CombinationsTester {
    public static void main ( String[] args )  {

        Scanner scan = new Scanner( System.in );
        long N;
        long R;

        System.out.println( "To exit, enter a negative value" );

        System.out.print("\n" + "Enter values for combination. " + "\n");

        System.out.print("\n" + "Enter N: " );
        N = scan.nextLong();

        System.out.print( "Enter R: " );
        R = scan.nextLong();

        while (true) {
            //if the inputted number is greater than 0, the factorial will be outputted
            if (N < 0 || R < 0) {
                //when inputted number is less than 0, the program states an error message and stops
                System.out.println("Error. A number(s) is negative.");
                break;
            }
            if (R > N) {
                //when N is less than R, the program states an error message and stops
                System.out.println("Error. R cannot be greater than N.");
                break;
            }
            else {
                //Prints the calculation of nCr and calls the combinations method
                System.out.println( "Value of "+ N + "C" + R +"= "+ combinations(N, R));

                System.out.print("\n" + "Enter values for permutation. " + "\n");
                System.out.print("\n" + "Enter N: " );
                N = scan.nextLong();
                System.out.print( "Enter R: " );
                R = scan.nextLong();
                System.out.println( "Permutation of "+ N + "P" + R +"= "+ nPx(N, R));

                System.out.print("\n" + "Enter values for combination. " + "\n");
                System.out.print("\n" + "Enter N: " );
                N = scan.nextLong();
                System.out.print( "Enter R: " );
                R = scan.nextLong();
            }
        }
    }
    //method calculates the factorial of a number
    public static long factorial( long num ){
        long fct = 1;
        //when number inputted is greater than 0 or less than 21 or equal to one of the two, the factorial of the number is calculated
        if (num >= 0 && num <= 21) {
            for ( int j=1; j<=num; j++ )
                fct *= j;
            return fct;
        }
        //if outside of the conditions, returns -1
        return -1;
    }
    //method calculates the combinations of the two numbers inputted
    public static long combinations(long num, long amnt) {
        //variable to calculate the difference of num - amnt
        long subtraction = num - amnt;
        //if num and amnt is greater than or equal to 0 and the difference is less than 21, returns the permutatioin of n and x
        if (num >= 0 && amnt >= 0 && subtraction < 21) {
            return nPx(num, amnt) / factorial(subtraction) ;
        }
        else {
            System.out.println("Error. Factorial cannot be computed!");
        }
        //if out of range, returns -2
        return -2;
    }
    //method to calculation permutation through setting the condition of the difference to be less than 21 to ensure no overflow
    public static long nPx(long n, long r) {
        long j = 1;
        long perm = n;
        if (n-r >=0 && n-r < 21 && n >= 0 && r >= 0) {
            while ( j < (n -r)) {
                perm = perm*(n-j);
                j = j + 1;
            }
            return perm;
        }
        else {
            System.out.println("Error. Factorial cannot be computed!");
            //if out of range, returns -2
            return -3;
        }
    }
}
