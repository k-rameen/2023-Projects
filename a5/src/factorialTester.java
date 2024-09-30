import java.util.*;
class factorialTester {
    public static void main ( String[] args )  {

        Scanner scan = new Scanner( System.in );
        long fact;
        long N;

        System.out.println( "To exit, enter a negative value" );

        System.out.print( "Enter N: " );
        N = scan.nextLong();

        //while the inputted number is greater than 0, the factorial will be outputted
        while (true) {
            fact = factorial( N );
            //when inputted number is less than 0, the program states an error message and stops
            if (N < 0) {
                System.out.println("Error the number is negative");
                break;
            }
            System.out.println( "factorial is " + fact );
            System.out.print( "Enter N: " );
            N = scan.nextLong();
        }
    }
    //method calculates the factorial of a number
    public static long factorial( long num ){
        long fct = 1;
        //when number inputted is greater than 0 or less than 20 or equal to one of the two, the factorial of the number is calculated
        if (num >= 0 && num <= 20) {
            for ( int j=1; j<=num; j++ )
                fct *= j;
            return fct;
        }
        //if outside of the conditions, returns -1
        return -1;
    }
}
