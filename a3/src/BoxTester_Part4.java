/*class Box
A class that implements a cardboard box and creates a box that is bigger than a given box and a smaller box by 20%

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
*/
final class Box4{
    //Instance variables
    private final double width;  // width of the side
    private final double height;  // height of the side
    private final double length; //length of the side

    //Constructor to make Box
    public Box4( double width, double height, double length ) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    //Constructor to make a cube box
    public Box4( double side )  {
        this.width = side;
        this.height = side;
        this.length = side;
    }
    //Creates an old box constructor
    public Box4( Box4 oldBox ) {
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
    public Box4 biggerBox( Box4 oldBox ) {
        return new Box4( 1.20*oldBox.getWidth(), 1.20*oldBox.getHeight(), 1.20*oldBox.getLength() );
    }
    //method that creates a box 20% smaller
    public Box4 smallerBox( Box4 oldBox ) {
        return new Box4( 0.75*oldBox.getWidth(), 0.75*oldBox.getHeight(), 0.75*oldBox.getLength() );
    }
}

/*
Rameen Khan

February 24, 2023

Tests the height, width and length getters and values along with area and volume methods in a box object

Tests the height, width and length getters and values along with area and volume methods in a new box object

Also tests the cube box object with one set value through the height, width and length getters along with the area and volume methods

Tests the bigger and smaller box methods
*/

class BoxTester_Part4  {
    public static void main ( String[] args ) {

        //Creates a box object with three values of length, width and height
        Box4 box = new Box4( 2.5, 5.0, 6.0 ) ;

        //Prints the height, width, length, area and volume
        System.out.println("\n Box \n" + "\n Height: " + box.getHeight() + "\n Width: " + box.getWidth() + "\n Length: " + box.getLength() + "\n Area: "  + box.area() + "\n Volume: " + box. volume() );

        //Creates an old box object
        Box4 oldBox = new  Box4(4.5, 7.0, 9.0) ;

        System.out.println("\n Old Box \n" + "\n Height: " + oldBox.getHeight() + "\n Width: " + oldBox.getWidth() + "\n Length: " + oldBox.getLength() + "\n Area: "  + oldBox.area() + "\n Volume: " + oldBox.volume() );

        //Creates a new box object
        Box4 newBox = new  Box4(oldBox) ;

        System.out.println("\n New Box \n" + "\n Height: " + newBox.getHeight() + "\n Width: " + newBox.getWidth() + "\n Length: " + newBox.getLength() + "\n Area: "  + newBox.area() + "\n Volume: " + newBox.volume() );

        //Creates a bigger box object that uses a previous box's values to increase
        Box4 biggerBox = newBox.biggerBox(oldBox) ;

        System.out.println("\n Bigger Box \n" + "\n Height: " + biggerBox.getHeight() + "\n Width: " + biggerBox.getWidth() + "\n Length: " + biggerBox.getLength() + "\n Area: "  + biggerBox.area() + "\n Volume: " + biggerBox.volume() );

        //Creates a smaller box object that uses a previous box's values to decrease
        Box4 smallerBox = newBox.smallerBox(oldBox)  ;

        System.out.println("\n Smaller Box \n" + "\n Height: " + smallerBox.getHeight() + "\n Width: " + smallerBox.getWidth() + "\n Length: " + smallerBox.getLength() + "\n Area: "  + smallerBox.area() + "\n Volume: " + smallerBox.volume() );

        //Creates a cube box object
        Box cube = new Box(2.5) ;

        System.out.println("\n Cube \n" + "\n Height: " + cube.getHeight() + "\n Width: " + cube.getWidth() + "\n Length: " + cube.getLength() + "\n Area: "  + cube.area() + "\n Volume: " + cube.volume() );

    }
}


