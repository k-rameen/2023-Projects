/*
Rameen Khan
April 3, 2023
A three level inheritance structure including an object that is made of, or contains, all of the objects created and a tester
*/
public class ToyStoreArray{
    public static void main ( String args[] )  {
        Toy[] inventory = new Toy[4];
        inventory[0] = new Doll("Barbie", 24.30, "Blonde", "Dress" );
        inventory[1] = new Car("Lightning McQueen", 15.50, "Red", true, 10);

        System.out.println("Doll: " + inventory[0]);
        System.out.println("Car: " + inventory[1]);

    }
} 