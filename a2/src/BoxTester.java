
public class BoxTester{
    public static void main( String[] args ) {

        //creates a boxOne object constructor
        Box boxOne = new Box(3.5, 6.0, 8.0);

        //prints the width, height, length, volume, surface area and diagonal length while getting the values through the get methods
        System.out.println("\n Box \n" + "\n Width: " + boxOne.getWidth() + "\n Height: " + boxOne.getHeight() + "\n Length: " + boxOne.getLength() + "\n Volume: "  + boxOne.volume() + "\n Surface area: " + boxOne.surfaceArea() + "\n Diagonal Length: " + boxOne.diagonalLength());

        //set new values thru set methods
        boxOne.setWidth(9);
        boxOne.setHeight(3);
        boxOne.setLength(4.5);

        //prints the width, height, length, volume, surface area and diagonal length while getting the new values through the get methods
        System.out.println("\n New Box \n" + "\n Width: " + boxOne.getWidth() + "\n Height: " + boxOne.getHeight() + "\n Length: " + boxOne.getLength() + "\n Volume: " + boxOne.volume() + "\n Surface area: " + boxOne.surfaceArea() + "\n Diagonal Length: " + boxOne.diagonalLength());

        Box boxTwo = new Box(-3.5, -7.0, -9.0);

        //prints the width, height, length, volume, surface area and diagonal length while getting the values through the get methods
        System.out.println("\n Box Two \n" + "\n Width: " + boxTwo.getWidth() + "\n Height: " + boxTwo.getHeight() + "\n Length: " + boxTwo.getLength() + "\n Volume: "  + boxTwo.volume() + "\n Surface area: " + boxTwo.surfaceArea() + "\n Diagonal Length: " + boxTwo.diagonalLength());

        //new constructor for a box with all same sides
        Box cubeBox = new Box(3.5);

        //prints the sides, volume, surface area and diagonal length while getting the value through the get methods
        System.out.println("\n Cube \n" + "\n Width: " + cubeBox.getWidth() + "\n Height: " + cubeBox.getHeight() + "\n Length: " + cubeBox.getLength() + "\n Volume: " + cubeBox.volume() + "\n Surface area: " + cubeBox.surfaceArea() + "\n Diagonal Length: " + cubeBox.diagonalLength());

    }
}
