/*
file: Sphere.java
Khan, Rameen
February 14, 2023
*/

public class Sphere{

    private double radius;  // radius of the base

    public Sphere( double radius){
        this.radius = radius;
    }

    public double surfaceArea(){
        return Math.PI*4*radius*radius;
    }

    public double volume(){
        return Math.PI*4/3*radius*radius;
    }

    public void setRadius( double radius ){
        if ( radius >= 0 ) {
            this.radius = radius;
        }
    }

    public double getRadius( ){
        return radius;
    }

}
