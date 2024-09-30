/*class Box
A class that implements a cardboard box and evaluates to true or false depending on whether an inside box completely fits inside an existing box

Constructors

Creates a box with three characteristics/variables: width, height and length
Box ( double width, double height, double length )

Creates a cube with all the same side values: length = width = height
Box ( double side )

Methods

Calculates the volume of the box
double volume()

Calculates the area of the box
double area()

Gets height value
double getHeight()

Gets width value
double getWidth()

Get length value
double getLength()

Creates a box 20% larger
Box biggerBox( Box oldBox )

Creates a box 20% smaller
Box smallerBox( Box oldBox )

Creates a true or false method for if the inside box fits into an existng box
public boolean nests( Box insideBox )
*/
import java.util.Arrays;
final class Box5{
    //Instance variables
    private final double width;  // width of the side
    private final double height;  // height of the side
    private final double length; //length of the side

    //Constructor to make Box
    public Box5( double width, double height, double length ) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    //Constructor to make a cube box
    public Box5( double side )  {
        this.width = side;
        this.height = side;
        this.length = side;
    }
    //Creates an old box constructor
    public Box5( Box5 oldBox ) {
        this.width = oldBox.getWidth();
        this.length = oldBox.getLength();
        this.height = oldBox.getHeight();
    }

    //Method that calculates the area of a box using all the sides
    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;
    }

    //Method that calculates the face area
    private double faceArea() {
        return width*height;
    }

    //Method that calculates the top area
    private double topArea() {
        return width*length;
    }

    //Method that calculates the side area
    private double sideArea() {
        return length*height;
    }

    //Calculates the volume method
    public double volume() {
        return length*width*height;
    }

    //gets height value method
    public double getHeight( ) {
        return height ;
    }

    //gets width value method
    public double getWidth( ) {
        return width ;
    }

    //gets length value method
    public double getLength() {
        return length;
    }
    //method that creates a box 20% bigger
    public Box5 biggerBox( Box5 oldBox ) {
        return new Box5( 1.20*oldBox.getWidth(), 1.20*oldBox.getHeight(), 1.20*oldBox.getLength() );
    }
    //method that creates a box 20% smaller
    public Box5 smallerBox( Box5 oldBox ) {
        return new Box5( 0.75*oldBox.getWidth(), 0.75*oldBox.getHeight(), 0.75*oldBox.getLength() );
    }
    //Creates a true or false method for if the inside box fits into an existng box using the volume to compare
    public boolean nests( Box5 outsideBox ) {

        //Array that gathers the height, length and width to check the largest to smallest dimensions between the big box
        double[] bigBoxDimensionCheck = {outsideBox.getHeight(), outsideBox.getLength(), outsideBox.getWidth() };
        Arrays.sort(bigBoxDimensionCheck);
        //Creates variables for the array list
        double smallestDim = bigBoxDimensionCheck[0];
        double mediumDim = bigBoxDimensionCheck[1];
        double biggestDim = bigBoxDimensionCheck[2];

        //Array that gathers the height, length and width to check the largest to smallest dimensions between the small box
        double[] smallBoxDimensionCheck = {this.getHeight(), this.getLength(), this.getWidth() };
        Arrays.sort(smallBoxDimensionCheck);

        double smallestDimTwo = smallBoxDimensionCheck[0];
        double mediumDimTwo = smallBoxDimensionCheck[1];
        double biggestDimTwo = smallBoxDimensionCheck[2];

        //returns a check between the smallest, medium and biggest dimensions between the big and small box and checks to see if the small box has less than or equal to dimensions
        return (smallestDimTwo <= smallestDim && mediumDimTwo <= mediumDim && biggestDimTwo <= biggestDim);
    }
}

/*
Rameen Khan

February 24, 2023

Tests the height, width and length getters and values along with area and volume methods in a box object

Tests the height, width and length getters and values along with area and volume methods in a new box object

Also tests the cube box object with one set value through the height, width and length getters along with the area and volume methods

Tests the bigger and smaller box methods

Tests whether an inside box can completely fit inside an existing box using each dimension in a different variation
*/

class BoxTester_Part5  {
    public static void main ( String[] args ) {

        //Creates a box object with three values of length, width and height
        Box5 box = new Box5( 2.5, 5.0, 6.0 ) ;

        //Prints the height, width, length, area and volume
        System.out.println("\n Box \n" + "\n Height: " + box.getHeight() + "\n Width: " + box.getWidth() + "\n Length: " + box.getLength() + "\n Area: "  + box.area() + "\n Volume: " + box. volume() );

        //Creates an old box object
        Box5 oldBox = new  Box5(4.5, 7.0, 9.0) ;

        System.out.println("\n Old Box \n" + "\n Height: " + oldBox.getHeight() + "\n Width: " + oldBox.getWidth() + "\n Length: " + oldBox.getLength() + "\n Area: "  + oldBox.area() + "\n Volume: " + oldBox.volume() );

        //Creates a new box object
        Box5 newBox = new  Box5(oldBox) ;

        System.out.println("\n New Box \n" + "\n Height: " + newBox.getHeight() + "\n Width: " + newBox.getWidth() + "\n Length: " + newBox.getLength() + "\n Area: "  + newBox.area() + "\n Volume: " + newBox.volume() );

        //Creates a bigger box object that uses a previous box's values to increase
        Box5 biggerBox = newBox.biggerBox(oldBox) ;

        System.out.println("\n Bigger Box \n" + "\n Height: " + biggerBox.getHeight() + "\n Width: " + biggerBox.getWidth() + "\n Length: " + biggerBox.getLength() + "\n Area: "  + biggerBox.area() + "\n Volume: " + biggerBox.volume() );

        //Creates a smaller box object that uses a previous box's values to decrease
        Box5 smallerBox = newBox.smallerBox(oldBox)  ;

        System.out.println("\n Smaller Box \n" + "\n Height: " + smallerBox.getHeight() + "\n Width: " + smallerBox.getWidth() + "\n Length: " + smallerBox.getLength() + "\n Area: "  + smallerBox.area() + "\n Volume: " + smallerBox.volume() );

        //Creates a cube box object
        Box5 cube = new Box5(2.5) ;

        System.out.println("\n Cube \n" + "\n Height: " + cube.getHeight() + "\n Width: " + cube.getWidth() + "\n Length: " + cube.getLength() + "\n Area: "  + cube.area() + "\n Volume: " + cube.volume() );

        //Creates an outside box with the same dimensions as the existing box
        Box5 outsideBox = new Box5( 2.5, 5.0, 6.0 ) ;

        System.out.println("\n Outside Box \n" + "\n Height: " + outsideBox.getHeight() + "\n Width: " + outsideBox.getWidth() + "\n Length: " + outsideBox.getLength() + "\n Area: "  + outsideBox.area() + "\n Volume: " + outsideBox. volume());

        //Creates an inside box that will be tested to see if it fits inside the outside box
        Box5 insideBox = new Box5(10.5, 9.8, 7.5) ;

        System.out.println("\n Inside Box \n" + "\n Height: " + insideBox.getHeight() + "\n Width: " + insideBox.getWidth() + "\n Length: " + insideBox.getLength() + "\n Area: "  + insideBox.area() + "\n Volume: " + insideBox. volume() + "\n Fits inside existing box: " + insideBox.nests(outsideBox)  );

        //Creates an inside box that will be tested to see if it fits inside the outside box
        Box5 insideBoxTwo = new Box5(9.8, 7.5, 10.5) ;

        System.out.println("\n Inside Box Two \n" + "\n Height: " + insideBoxTwo.getHeight() + "\n Width: " + insideBoxTwo.getWidth() + "\n Length: " + insideBoxTwo.getLength() + "\n Area: "  + insideBoxTwo.area() + "\n Volume: " + insideBoxTwo.volume() + "\n Fits inside existing box: " + insideBoxTwo.nests(outsideBox)  );

        //Creates an inside box that will be tested to see if it fits inside the outside box
        Box5 insideBoxThree = new Box5(7.5, 10.5, 9.8) ;

        System.out.println("\n Inside Box Three \n" + "\n Height: " + insideBoxThree.getHeight() + "\n Width: " + insideBoxThree.getWidth() + "\n Length: " + insideBoxThree.getLength() + "\n Area: "  + insideBoxThree.area() + "\n Volume: " + insideBoxThree.volume() + "\n Fits inside existing box: " + insideBoxThree.nests(outsideBox)  );

        //Creates an inside box that will be tested to see if it fits inside the outside box
        Box5 insideBoxFour = new Box5( 1.0, 1.5, 2.0) ;

        System.out.println("\n Inside Box Four \n" + "\n Height: " + insideBoxFour.getHeight() + "\n Width: " + insideBoxFour.getWidth() + "\n Length: " + insideBoxFour.getLength() + "\n Area: "  + insideBoxFour.area() + "\n Volume: " + insideBoxFour. volume() + "\n Fits inside existing box: " + insideBoxFour.nests(outsideBox)  );

        //Creates an inside box that will be tested to see if it fits inside the outside box
        Box5 insideBoxFive = new Box5(2.0, 1.0, 1.5) ;

        System.out.println("\n Inside Box Five \n" + "\n Height: " + insideBoxFive.getHeight() + "\n Width: " + insideBoxFive.getWidth() + "\n Length: " + insideBoxFive.getLength() + "\n Area: "  + insideBoxFive.area() + "\n Volume: " + insideBoxFive.volume() + "\n Fits inside existing box: " + insideBoxFive.nests(outsideBox)  );

        //Creates an inside box that will be tested to see if it fits inside the outside box
        Box5 insideBoxSix = new Box5(1.5, 2.0, 1.0) ;

        System.out.println("\n Inside Box Six \n" + "\n Height: " + insideBoxSix.getHeight() + "\n Width: " + insideBoxSix.getWidth() + "\n Length: " + insideBoxSix.getLength() + "\n Area: "  + insideBoxSix.area() + "\n Volume: " + insideBoxSix.volume() + "\n Fits inside existing box: " + insideBoxSix.nests(outsideBox)  );

        //Creates an inside box that will be tested to see if it fits inside the outside box
        Box5 insideBoxSeven = new Box5(2.5, 5.0, 6.0) ;

        System.out.println("\n Inside Box Seven \n" + "\n Height: " + insideBoxSeven.getHeight() + "\n Width: " + insideBoxSeven.getWidth() + "\n Length: " + insideBoxSeven.getLength() + "\n Area: "  + insideBoxSeven.area() + "\n Volume: " + insideBoxSeven.volume() + "\n Fits inside existing box: " + insideBoxSeven.nests(outsideBox)  );
    }
}


