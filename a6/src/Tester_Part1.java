class Tester{
    //variable creates a string for greeting
    String greeting;
    int length;
    int j;
    //constructor that initializes objects
    public Tester( String greeting) {
        this.greeting = greeting;
        length = greeting.length();
    }
    // method definition
    public void greeting()  {
        for ( j = 1; j <= length; j++) {
            System.out.println(greeting);
        }
    }
}

public class Tester_Part1{
    public static void main ( String[] args )  {
        //object for creating the greeting
        Tester object = new Tester("Hello");
        //calls the greeting method with the object
        object.greeting();

    }
}
