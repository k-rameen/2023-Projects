/*
Rameen Khan
April 20, 2023
Assignment 9
Diamonds are ordered first by carot, then by clarity or color, whichever is better for the particular diamond.
*/
class Diamond implements Comparable<Diamond>
{
    private String stockNumber;

    private double carot;       /* size of the diamond */
    private String clarity;  /* clarity grade of the diamond */
    private char color;      /* color grade D-Z */
    private String cut;      /* name of the cut */

    String getStock()   {
        return stockNumber;
    }

    double getCarot()   {
        return carot;
    }

    String getClarity() {
        return clarity;
    }

    char   getColor()   {
        return color;
    }

    String getCut()     {
        return cut;
    }

    public Diamond(String s, double car, String clar, char col, String ct) {
        stockNumber = s;  carot = car; clarity = clar; color = col; cut = ct;
    }
    //prints diamond information
    public String toString(){
        return "Stock Number: " + getStock() + ", Carot: " + getCarot() + ", Clarity: " + getClarity() + ", Color: " + getColor() + ", Cut: " + getCut();
    }

    public int compareTo( Diamond other ) {
        //carots turned into integers
        int carot = (int)(getCarot()*10);
        int otherCarot = (int)(other.getCarot()*10);
        //clarity, color and other clarity and color assigned values in clarityValue() and colorValue() methods
        int clarity = clarityValue();
        int otherClarity = other.clarityValue();
        int color = colorValue();
        int otherColor = other.colorValue();
        //attribute variables created to compare color and clarity values
        int betterAttribute = 0;
        int betterAttributeOther = 0;
        int worseAttribute = 0;
        int worseAttributeOther = 0;

        //carot sizes are compared, smaller/lower number means greater value
        if (carot < otherCarot) {
            return 1;
        }
        else if (carot > otherCarot) {
            return -1;
        }
        //if the sizes are the same, then clarity and color are compared
        else if (carot == otherCarot) {
            //betterAttribute assigned to lower number
            if (color < clarity) {
                betterAttribute = color;
                worseAttribute = clarity;
            }
            else if (color > clarity) {
                betterAttribute = clarity;
                worseAttribute = color;
            }
            //equal in value therefore either or works for attribute variables
            else if (color == clarity) {
                betterAttribute = clarity;
                worseAttribute = color;
            }
            //same as previous if statements but with other
            if (otherColor < otherClarity) {
                betterAttributeOther = otherColor;
                worseAttributeOther = otherClarity;
            }
            else if (otherColor > otherClarity) {
                betterAttributeOther = otherClarity;
                worseAttributeOther = otherColor;
            }
            else if (otherColor == otherClarity) {
                betterAttributeOther = otherClarity;
                worseAttributeOther = otherColor;
            }
            //return 1 if other attribute has greater value vice versa
            if (betterAttribute > betterAttributeOther) {
                return 1;
            }
            else if (betterAttribute < betterAttributeOther) {
                return -1;
            }
            //if they equal to each other
            else if (betterAttribute == betterAttributeOther) {
                if (clarity == otherClarity){
                    //worse attribute will equal color and otherColor
                    if (worseAttribute > worseAttributeOther){
                        //calculates difference
                        return -1*(worseAttribute - worseAttributeOther);
                    }
                    else {
                        return -1*(worseAttributeOther - worseAttribute);
                    }
                }
                //vice versa with color is equal then clarity is compared
                else if (color == otherColor){
                    if (clarity > otherClarity) {
                        return -1*(clarity - otherClarity);
                    }
                    else {
                        return -1*(otherClarity - clarity);
                    }
                }
            }
        }
        //ensures 1000 is never printed
        return 1000;
    }

    public int clarityValue() {
        int clar1 = -1;

        //setting values to the clarities
        if (getClarity().equals("FL")){
            clar1 = 1;
        }
        if (getClarity().equals("IF")){
            clar1 = 2;
        }
        if (getClarity().equals("VVS1")){
            clar1 = 3;
        }
        if (getClarity().equals("VVS2")){
            clar1 = 4;
        }
        if (getClarity().equals("VS1")){
            clar1 = 5;
        }
        if (getClarity().equals("VS2")){
            clar1 = 6;
        }
        if (getClarity().equals("SI1")){
            clar1 = 7;
        }
        if (getClarity().equals("SI2")){
            clar1 = 8;
        }
        if (getClarity().equals("I1")){
            clar1 = 9;
        }
        if (getClarity().equals("I2")){
            clar1 = 10;
        }
        if (getClarity().equals("I3")){
            clar1 = 11;
        }
        //must return int
        return clar1;
    }

    //making the getColor() method equal to the color grades
    public int colorValue() {
        int color1 = -1;

        if (getColor() == ('D') || getColor() == ('E')){
            color1 = 1;
        }
        if (getColor() == ('F') || getColor() == ('G')){
            color1 = 2;
        }
        if (getColor() == ('H') || getColor() == ('I')){
            color1 = 3;
        }
        if (getColor() == ('J') || getColor() == ('K')){
            color1 = 4;
        }
        if (getColor() == ('L') || getColor() == ('M')){
            color1 = 5;
        }
        if (getColor() == ('N') || getColor() == ('O')){
            color1 = 6;
        }
        if (getColor() == ('P') || getColor() == ('Q')){
            color1 = 7;
        }
        if (getColor() == ('R') || getColor() == ('S')){
            color1 = 8;
        }
        if (getColor() == ('T') || getColor() == ('U')){
            color1 = 9;
        }
        if (getColor() == ('V') || getColor() == ('W')){
            color1 = 10;
        }
        if (getColor() == ('X') || getColor() == ('Y') || getColor() == ('Z')){
            color1 = 11;
        }
        //must return int
        return color1;
    }
}
