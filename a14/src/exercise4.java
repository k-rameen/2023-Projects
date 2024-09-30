import java.util.Scanner;

public class exercise4 {
    public static boolean equalX(String str1, String str2) {
        //if empty strings, they are equal
        if(str1.isEmpty() && str2.isEmpty()) {
            return true;
        }
        //if either are empty, then not equal
        if(str1.isEmpty() || str2.isEmpty()) {
            return false;
        }
        char char1 = str1.charAt(0);
        char char2 = str2.charAt(0);

        if (char1 == 'X' && char2 == 'X') {
            //if both char X, check string tails
            return equalX(str1.substring(1), str2.substring(1));
        }
        else if (char1 == 'X' || char2 == 'X') {
            //if one char equal to X and other not, not equal
            return false;
        }
        else {
            //if neither, check string tails
            return equalX(str1.substring(1), str2.substring(1));
        }
    }
    public static void main(String[] args) {

        System.out.println(equalX("X", "X"));

        System.out.println(equalX("aaaXaaaX", "abcXcbaX"));;

        System.out.println(equalX("XXXX", "XX"));

        System.out.println(equalX("aXaXbXcX", "XtXoXpX"));

    }
}
