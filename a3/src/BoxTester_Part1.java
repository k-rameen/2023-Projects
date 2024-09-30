/*class Box
A class that implements a cardboard box.

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
*/
final class Box {

    //Instance variables
    private final double width;  // width of the side
    private final double height;  // height of the side
    private final double length; //length of the side

    //Constructor to make Box
    public Box( double width, double height, double length ) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    //Constructor to make a cube box
    public Box( double side )  {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    public double area() { //calculates area method
        return 2*(length*width + length*height + width*height);
    }

    public double volume() { //calculates volume method
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
}

/*
Rameen Khan

February 24, 2023

Tests the height, width and length getters and values along with area and volume methods in a box object

Also tests the cube box object with one set value through the height, width and length getters along with the area and volume methods
*/
class BoxTester_Part1  {
    public static void main ( String[] args ) {

        //Creates a box object with three values of length, width and height
        Box box = new Box( 2.5, 5.0, 6.0 ) ;

        //Prints the height, width, length, area and volume
        System.out.println("\n Box \n" + "\n Height: " + box.getHeight() + "\n Width: " + box.getWidth() + "\n Length: " + box.getLength() + "\n Area: "  + box.area() + "\n Volume: " + box. volume() );

        //Creates a cube box object
        Box cube = new Box(2.5) ;

        System.out.println("\n Cube \n" + "\n Height: " + cube.getHeight() + "\n Width: " + cube.getWidth() + "\n Length: " + cube.getLength() + "\n Area: "  + cube.area() + "\n Volume: " + cube.volume() );

    }
}

