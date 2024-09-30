import java.util.*;
class Tester5{
    String input;
    // constructor to use input
    public Tester5(String input)  {
        this.input = input;
    }
    // constructor for oldObject value
    public Tester5(Tester5 oldObject)
    {
        //Prints a string through dot notation
        this.input = new String(oldObject.input);
    }
    //method to print the inputted values in the objects
    public void printInput() {
        System.out.println("\n" + input);
    }
}
public class Tester_Part5{
    public static void main ( String[] args )  {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter greeting: ");
        //creates object using the input
        Tester5 object = new Tester5(scan.nextLine());
        //oldObject takes the value of object
        Tester5 oldObject = new Tester5(object);

        //calls the printInput method with the object
        object.printInput();
        //calls the printInput method with oldObject
        oldObject.printInput();
    }
}