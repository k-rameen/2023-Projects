/*
Rameen Khan
April 3, 2023
A three level inheritance structure including an object that is made of, or contains, all of the objects created and a tester
*/
public class ToyStore{
    public static void main ( String args[] )  {

        Doll doll = new Doll("Barbie", 24.30, "Blonde", "Dress" );
        Car car = new Car("Lightning McQueen", 15.50, "Red", true, 10);
        Storage storage = new Storage(car, doll, "61 Brockwood Avenue", "Prime Storage");
        Brand brand = new Brand("Jade", 20.50, "Black", "Pants and shirt", "Bratz", 1000.00);

        System.out.println("\n" + "Printing the details of doll: " + "\n");

        System.out.println("Brand name: " + brand.getBrandName() + " Advertising cost: " + brand.getAd());

        System.out.println(brand.toString() + "\n");

        System.out.println(brand.CompanyAd() + "\n");

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