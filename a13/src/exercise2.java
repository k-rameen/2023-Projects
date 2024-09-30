import java.util.Scanner;

public class exercise2 {

    public static int sum( int[] array, int index ) {
        //if equal to each other
        if (index == array.length) {
            return 0;
        }
        //formula array plus sum parameter
        else {
            return array[index] + sum(array, index + 1);
        }
    }
    public static void main ( String[] args) {
        //tests 0
        int[] testArray = {0};

        int result = sum(testArray, 0);
        System.out.println("Result: " + result);
    }
}