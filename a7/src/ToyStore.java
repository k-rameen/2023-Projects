/*
Rameen Khan
April 3, 2023
A three level inheritance structure including an object that is made of, or contains, all of the objects created and a tester
*/
public class ToyStore{
    public static void main ( String args[] )  {

        Toy toy = new Toy("Superman", 10.75, "Superheroes" );
        Toy toy2 = new Toy("Dino");
        Doll doll = new Doll("Barbie", 24.30, "Blonde", "Dress" );
        Car car = new Car("Lightning McQueen", 15.50, "Red", true );
        Storage storage = new Storage(car, doll, toy, "61 Brockwood Avenue", "Prime Storage");

        System.out.println("Printing the details of toy: " + "\n");

        System.out.println(toy.toString() + "\n");

        System.out.println(toy.playing() + "\n");

        System.out.println("---------------------");

        System.out.println("Printing the details of toy 2: " + "\n");

        System.out.println(toy2.toString() + "\n");

        System.out.println(toy2.playing() + "\n");

        System.out.println("---------------------");

        System.out.println("\n" + "Printing the details of doll: " + "\n");

        System.out.println(doll.toString() + "\n");

        System.out.println(doll.brush() + "\n");

        System.out.println("---------------------");

        System.out.println("\n" + "Printing the details of car: " + "\n");

        System.out.println(car.toString() + "\n");

        System.out.println(car.raceTrack() + "\n");

        System.out.println("---------------------");

        System.out.println("\n" + "Printing the details of items in storage: " + "\n");

        System.out.println(storage.toString() + "\n");

        System.out.println(storage.totalCost());

    }
} 