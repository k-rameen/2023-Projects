import java.util.Scanner;
class odiousTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        System.out.println( "To exit, enter a negative value" );

        //while user input number is greater than or equal to zero, then checks the number through the checkOdious method, if false prints odious and if true prints evil
        while ( num >= 0 ) {
            System.out.print( "Enter num: " );
            num = scan.nextInt();
            if (num >= 0) {
                if (checkOdious(num)) {
                    System.out.println(num + " is odious");
                }
                else {
                    System.out.println(num + " is evil");
                }
            }
        }
    }
    //method checks if the number has a remainder of 0
    public static boolean checkOdious(long num) {
        //creates counter to keep track of the numbers
        int counter = 0;
        while (num != 0) {
            //if remainder is equal to 1, then counter is increased by one
            if (num%2 == 1) {
                counter ++;
            }
            //number is divided by two to see if it is an odd number of ones
            num = num/2;
        }
        //if remainder is equal to zero, then returns false/odious
        if (counter%2 == 0) {
            return false;
        }
        //if remainder is equal to an odd number of ones, then returns true/evil
        return true;
    }

}