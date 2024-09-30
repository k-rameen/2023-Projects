class SpeedStorage
{
    public static void main ( String args[] ) {
        CarSpeed speed = new Car("Lightning McQueen", 15.50, "Red", true, 5 );
        CarSpeed speed2 = new Car("Lightning McQueen", 15.50, "Red", true, 21 );

        System.out.println("Speed of the car. Level: " + speed.getSpeed());
        while (speed2.getSpeed() > CarSpeed.maxSpeed ) {
            System.out.println("Cannot go higher!");
            break;
        }
        System.out.println("Speed of the car. Level: " + speed2.getSpeed());
    }
}