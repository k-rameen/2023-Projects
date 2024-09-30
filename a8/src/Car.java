class Car extends Toy implements CarSpeed{

    private String color;     // selection of colors (1: black, 2: red etc.)
    private boolean remoteControl;   // true: there is a remote controller, false: no controller
    //car level speed
    private int speed;

    // constructor
    public Car( String nm, double prc, String clr, boolean remCont, int speed )  {
        super( nm, prc, "Cars" );	// use the base class's constructor to initialize members inherited from it
        color = clr;   // initialize what's new to Car
        remoteControl = remCont;
        name = nm;
    }
    public String toString() {
        return super.toString() + "\nColor: " + getColor() + ", Remote controll: " + getRemoteControl();
    }
    public String raceTrack() {
        return "You are playing on the race track with " + name + ". " + name + " level's speed is " + getSpeed();
    }
    //setters and getters
    //gets color
    public String getColor() {
        return color;
    }
    //sets color
    public void setColor( String clr ) {
        color = clr;
    }
    //gets remote control
    public boolean getRemoteControl() {
        return remoteControl;
    }
    //sets if there is a remote control
    public void setRemoteControl( boolean remCont ) {
        remoteControl = remCont;
    }
    //method from interface CarSpeed
    public int getSpeed() {
        return this.speed;
    }
}