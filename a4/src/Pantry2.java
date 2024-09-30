class Pantry2
{
    // Instance Variables
    private Jam  jar1 ;
    private Jam  jar2 ;
    private Jam  jar3 ;
    private Jam  selected ;

    // Constructors
    Pantry2( Jam jar1, Jam jar2, Jam jar3 )
    {
        this . jar1 = jar1 ;
        this . jar2 = jar2 ;
        this . jar3 = jar3 ;
        selected = null ;
    }

    Pantry2( Jam jar1, Jam jar2)
    {
        this . jar1 = jar1 ;
        this . jar2 = jar2 ;
        this . jar3 = null ;
        selected = null ;
    }

    Pantry2( Jam jar1)
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

    // spread the selected jam
    public void spread( int ml )
    {
        selected . spread( ml ) ;
    }
}