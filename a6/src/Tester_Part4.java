import java.util.*;
class Tester4{
    String input;
    // constructor to use input
    public Tester4(String input)  {
        this.input = input;
    }
    // constructor for oldObject value
    public Tester4( Tester4 oldObject)
    {
        // initialize the new object's greeting to the same
        // as that of the oldObject’s parameter
        this.input = oldObject.input;
    }
    //method to print the inputted values in the objects
    public void printInput() {
        System.out.println("\n" + input);
    }
}
public class Tester_Part4{
    public static void main ( String[] args )  {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter greeting: ");
        //creates object using the input
        Tester4 object = new Tester4(scan.nextLine());
        //oldObject takes the value of object
        Tester4 oldObject = new Tester4(object);

        //calls the printInput method with the object
        object.printInput();
        //calls the printInput method with oldObject
        oldObject.printInput();
    }
}
