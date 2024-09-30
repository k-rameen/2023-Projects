import java.util.*;
import java.math.BigInteger;
class exercise2 {
    public static void main(String[] args) {
        //variable for while loop
        int test = 1;

        //to create a loop, this statement will always be true
        while ( test > 0) {
            Scanner scan = new Scanner(System.in);
            System.out.print("N (start): ");
            //variable for user input
            BigInteger N;
            N = scan.nextBigInteger();

            System.out.print("M (end): ");
            //variable for user input
            BigInteger M;
            M = scan.nextBigInteger();

            BigInteger sum = calculateSum(N, M);
            System.out.println("Series Sum: " + sum);

            BigInteger formula = calculateFormula(N, M);
            System.out.println("Formula Sum: " + formula);
        }
    }
    //calculating series sum
    public static BigInteger calculateSum(BigInteger N, BigInteger M) {
        BigInteger totalSum = BigInteger.ZERO;
        BigInteger counter = N;
        while (counter.compareTo(M) <= 0) {
            totalSum = totalSum.add(counter);
            counter = counter.add(BigInteger.ONE);
        }
        return totalSum;
    }
    public static BigInteger calculateFormula(BigInteger N, BigInteger M) {
        BigInteger sumToM = M.multiply(M.add(BigInteger.ONE)).divide(BigInteger.TWO);
        BigInteger sumToN1 = N.subtract(BigInteger.ONE).multiply(N).divide(BigInteger.TWO);

        return sumToM.subtract(sumToN1);
    }
}