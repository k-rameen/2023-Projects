class Doll extends Toy{
    private String hairColor;     // selection of hair colors (1: black, 2: brown, 3:blonde etc.)
    private String  clothing;   // selection of type of clothing (1: dress, 2: shirt and skirt etc.)

    // constructor
    public Doll( String nm, double prc, String hairClr, String clth )  {
        super( nm, prc, "Dolls" );	// use the base class's constructor to initialize members inherited from it
        hairColor = hairClr;   // initialize what's new to Doll
        clothing = clth;
        name = nm;
    }
    public String toString() {
        return super.toString() + "\nHair color: " + getHairColor() + ", Clothing: " + getClothing();
    }
    //brushes the name of the doll's hair
    public String brush() {
        return "You are brushing " + name + "'s hair";
    }
    //gets hair color
    public String getHairColor() {
        return hairColor;
    }
    //sets hair color
    public void setHairColor( String hairClr ) {
        hairColor = hairClr;
    }
    //gets clothing
    public String getClothing() {
        return clothing;
    }
    //sets clothing
    public void setClothing( String clth ) {
        clothing = clth;
    }
}