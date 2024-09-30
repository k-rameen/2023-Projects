/*
Rameen Khan
April 28, 2023
BigInteger Assignment
*/
import java.util.*;
import java.math.BigInteger;
class exercise1 {
    public static void main(String[] args) {
        //variable for while loop
        BigInteger i = BigInteger.ONE;
        //variable for while loop
        BigInteger sum = BigInteger.ZERO;
        BigInteger SUM;
        int test = 1;

        //to create a loop, this statement will always be true
        while ( test > 0) {
            Scanner scan = new Scanner(System.in);
            System.out.print("N: ");
            //variable for user input
            BigInteger N;
            N = scan.nextBigInteger();

            //i is set to zero, i is compared to N while greater than or equal to zero, i is incremented by one
            while (i.compareTo(N) <= 0) {
                sum = sum.add(i);
                i = i.add(BigInteger.ONE);
            }
            //formula sum
            SUM = (N.multiply((N).add(BigInteger.ONE))).divide(BigInteger.TWO);

            System.out.println("Series Sum: " + sum);
            System.out.println("Formula Sum: " + SUM);
        }
    }
}