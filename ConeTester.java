/* 
file: ConeTester.java 
Khan, Rameen
February 14, 2023 
*/
public class ConeTester{
    public static void main( String[] args ) {

        //Creates a cone object
        Cone coneOne = new Cone(15, 9.8);

        //tests the area and volume methods along with the getters
        System.out.println("\n Cone One \n" + "\n Radius: " + coneOne.getRadius() + "\n Height: " + coneOne.getHeight() + "\n Area: " + coneOne.area() + "\n Volume: " + coneOne.volume());

        //tests the angle and slant height methods
        System.out.println("\n Angle: " + coneOne.angle() + "\n Slant height: " + coneOne.slantHeight());

        //tests the radius and height getters and setters
        coneOne.setRadius(8);
        coneOne.setHeight(5);
        coneOne.getRadius();
        coneOne.getHeight();

        System.out.println("\n New Cone One \n" + "\n Radius: " + coneOne.getRadius() + "\n Height: " + coneOne.getHeight() + "\n Area: " + coneOne.area() + "\n Volume: " + coneOne.volume());

        //tests the angle and slant height methods
        System.out.println("\n Angle: " + coneOne.angle() + "\n Slant height: " + coneOne.slantHeight());

        Cone coneTwo = new Cone(-3, 0);

        //tests with negative & zero values
        System.out.println("\n Cone Two \n" + "\n Radius: " + coneTwo.getRadius() + "\n Height: " + coneTwo.getHeight() + "\n Area: " + coneTwo.area() + "\n Volume: " +     coneTwo.volume());

        //tests the angle and slant height methods
        System.out.println("\n Angle: " + coneTwo.angle() + "\n Slant height: " + coneTwo.slantHeight());

    }
}