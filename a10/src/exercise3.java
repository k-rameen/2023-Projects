import java.math.BigInteger;
import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N: ");
        BigInteger N = scanner.nextBigInteger();

        System.out.print("M: ");
        BigInteger M = scanner.nextBigInteger();

        //calculates series gcd
        BigInteger seriesGcd = calculateGCD(N, M);
        //calculates formula gcd
        BigInteger formulaGcd = N.gcd(M);

        System.out.println("Series GCD: " + seriesGcd);
        System.out.println("Formula GCD: " + formulaGcd);
    }
    //calculates series gcd
    private static BigInteger calculateGCD(BigInteger N, BigInteger M) {
        //while loop tests if N & M are less than 0, if so, N equals to N - M else, M equals to M - N
        while (!N.equals(M)) {
            if (N.compareTo(M) > 0) {
                N = N.subtract(M);
            }
            else {
                M = M.subtract(N);
            }
        }
        return N;
    }
}
