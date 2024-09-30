import java.util.Scanner;
class unluckyTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        System.out.println( "To exit, enter a negative value" );

        //while the number inputted is greater than or equal to zero, the loop repeatedly asks for a number until a negative value is entered and checks if it is unlucky or safe
        while ( num >= 0 ) {
            System.out.print( "Enter num: " );
            num = scan.nextInt();
            if (num >= 0) {
                if (checkUnlucky(num)) {
                    System.out.println(num + " is unlucky");
                }
                else {
                    System.out.println(num + " is safe");
                }
            }
        }
    }

    //method checks if the number is unlucky or safe
    public static boolean checkUnlucky(long num) {
        //old remainder variable used to check if three was previously entered
        double oldRemainder = 0;
        while (num != 0) {
            //if the remainders are in the sequence 1 and 3, returns true/unlucky
            if (num%10 == 1 && oldRemainder == 3) {
                return true;
            }
            //old remainder equals the remainder of the number inputted by 10
            oldRemainder = num%10;
            //number is divided by 10
            num = num/10;

        }
        //if remainder not in order of 1 and 3 then returns true/safe
        return false;
    }
}