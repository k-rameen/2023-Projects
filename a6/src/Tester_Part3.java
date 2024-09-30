import java.util.*;
class Tester3{
    //variable creates a string for greeting
    String input;
    // method definition
    public void greeting()  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter greeting: ");
        //scans the input from the user
        input = scan.nextLine();
        //prints the scanned input
        System.out.println("\n" + input);
    }
}
public class Tester_Part3{
    public static void main ( String[] args )  {

        //object for creating the greeting
        Tester3 object = new Tester3();
        //calls the greeting method with the object
        object.greeting();
    }
}
