class unluckEvilTester {
    public static void main(String[] args) {
        int counter;

        System.out.println( "To exit, enter a negative value" );

        System.out.print( "Enter num: " );

        //conditions are counter is set to 1, counter is less than or equal to 1000 and counter is increased by one
        for( counter = 1; counter <= 1000; counter++) {

            //checks both methods and if
            if (checkUnlucky(counter) & checkOdious(counter)) {
                System.out.println(counter + " is unlucky and evil" + "\n");
            }
        }
    }
    //checkOdious method
    public static boolean checkOdious(long num) {
        int counter = 0;
        while (num != 0) {
            if (num%2 == 1) {
                counter ++;
            }
            num = num/2;
        }
        if (counter%2 == 0) {
            return false;
        }

        return true;
    }
    //checkUnlucky method
    public static boolean checkUnlucky(long num) {
        double oldRemainder = 0;
        while (num != 0) {

            if (num%10 == 1 && oldRemainder == 3) {
                return true;
            }
            oldRemainder = num%10;
            num = num/10;

        }
        return false;
    }

}