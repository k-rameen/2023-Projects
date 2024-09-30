class Tester2 {
    //variables creates a string for moring and evening greetings
    String mornGreeting;
    String evenGreeting;
    //constructor that initializes objects
    public Tester2( String mornGreeting, String evenGreeting) {
        this.mornGreeting = mornGreeting;
        this.evenGreeting = evenGreeting;
    }
    // method definition
    public void greeting()  {
        System.out.println(mornGreeting + evenGreeting);
    }
}
public class Tester_Part2{
    public static void main ( String[] args )  {
        //object for creating the greetings
        Tester2 object = new Tester2(" Good morning World!", "\n Good evening World!");
        //calls the greeting method with the object
        object.greeting();
    }
}
