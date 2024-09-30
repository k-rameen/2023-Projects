/* 
file: SpheresTester.java 
Khan, Rameen
February 14, 2023 
*/
public class SphereTester{
    public static void main( String[] args ) {

        //creates a sphere object
        Sphere SpheresOne = new Sphere(12);

        //tests the surface area and volume methods and tests the radius setter and getter
        System.out.println("\n Sphere One \n" + " Radius: " + SpheresOne.getRadius() + "\n Surface Area: " + SpheresOne.surfaceArea() + "\n Volume: " + SpheresOne.volume());

        //tests the radius getters and setters
        SpheresOne.setRadius(3);
        SpheresOne.getRadius();

        System.out.println("\n New Sphere One \n" + "\n Radius: " + SpheresOne.getRadius() + "\n Surface Area: " + SpheresOne.surfaceArea() + "\n Volume: " + SpheresOne.volume());

        Sphere SpheresTwo = new Sphere(-9);

        //tests negative value
        System.out.println("\n Sphere Two \n" + "\n Surface Area: " + SpheresTwo.surfaceArea() + "\n Volume: " +     SpheresTwo.volume());

        Sphere SpheresThree = new Sphere(0);

        //tests zero value
        System.out.println("\n Sphere Three \n" + "\n Surface Area: " + SpheresThree.surfaceArea() + "\n Volume: " +     SpheresThree.volume());
    }
}