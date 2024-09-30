/*
file: Box.java
Khan, Rameen
February 16, 2023
*/

public class Box{

    private double width;  // width of the base
    private double height;
    private double length;

    //box method
    public Box( double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box( double side){ //cube method
        this.width = side;
        this.height = side;
        this.length = side;
    }

    public double surfaceArea(){ //calculates surface area method
        return 2*(length*width + length*height + width*height);
    }

    public double volume(){ //calculates volume method
        return length*width*height;
    }

    public double diagonalLength() {
        return Math.sqrt(height*height + (width*width + length*length)); //calculates diagonal length method
    }

    public void setHeight( double height ) { //sets height value
        if ( height >= 0 )
            this.height = height ;
    }

    public void setWidth( double width ) { //sets width value
        if ( width >= 0 )
            this.width = width;
    }
    public void setLength( double length) { //sets length value method
        if (length >= 0 )
            this.length = length;
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

