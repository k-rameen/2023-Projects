class Pantry4
{
    // Instance Variables
    private Jam  jar1 ;
    private Jam  jar2 ;
    private Jam  jar3 ;
    private Jam  selected ;

    // Constructors
    Pantry4( Jam jar1, Jam jar2, Jam jar3 )
    {
        this . jar1 = jar1 ;
        this . jar2 = jar2 ;
        this . jar3 = jar3 ;
        selected = null ;
    }

    Pantry4( Jam jar1, Jam jar2)
    {
        this . jar1 = jar1 ;
        this . jar2 = jar2 ;
        this . jar3 = null ;
        selected = null ;
    }

    Pantry4( Jam jar1)
    {
        this . jar1 = jar1 ;
        this . jar2 = null ;
        this . jar3 = null ;
        selected = null ;
    }

    // Methods
    public String toString()
    {
        String str = "";
        str += "1: " +  jar1.toString()  + "\n";
        if (jar2 != null) {
            str += "2: " +  jar2.toString()  + "\n";
        }
        if (jar3 != null) {
            str += "3: " +  jar3.toString()  + "\n";
        }
        return str;
    }

    // assume that the user entered a correct selection, 1, 2, or 3
    //deals with null instance variables through analyzing if they equal null or not
    public boolean select( int jarNumber )
    {
        if ( jarNumber == 1 )
            selected =  jar1 ;

        else if ( jarNumber == 2 && jar2 != null )
            selected = jar2 ;

        else if ( jarNumber == 3 && jar3 != null )
            selected = jar3 ;
        else {
            return false;
        }
        return true;
    }
    //replaces a particular jar of jam in the pantry with the object j through instantiating each jar
    public void replace( Jam j, int slot ) {

        if (slot == 1) {
            this.jar1 = j;
        }
        else if (slot == 2) {
            this.jar2 = j;
        }
        else if (slot == 3) {
            this.jar3 = j;
        }
        else {
            System.out.println("Enter a valid slot.");
        }
    }

    // spread the selected jam
    public void spread( int ml )
    {
        selected . spread( ml ) ;
    }

    public void mixedFruit() {

        //if each jar is not equal to null and their capacity is less than or equal to 20, adds up all capacities in the totalCapacity variable to create a mixed fruit jam
        if (jar1 != null && jar1.getCapacity() <= 20
                && jar2 != null && jar2.getCapacity() <= 20
                && jar3 != null && jar3.getCapacity() <= 20) {

            int totalCapacity = jar1.getCapacity() + jar2.getCapacity() + jar3.getCapacity();
            Jam mixedFruit = new Jam("Mixed Fruit", "7/4/86", totalCapacity);
            this.replace(mixedFruit, 1);
            this.jar2 = null;
            this.jar3 = null;
        }

    }
}