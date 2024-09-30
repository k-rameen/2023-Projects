public class PantryTester
{
    public static void main ( String[] args )
    {
        Jam goose = new Jam( "Gooseberry", "7/4/86", 120 );
        Jam apple = new Jam( "Crab Apple", "9/30/99", 80 );
        Jam rhub  = new Jam( "Rhubarb", "10/31/99", 30 );

        Pantry hubbard = new Pantry( goose, apple, rhub );
        System.out.println( hubbard );

        hubbard.select(1);
        hubbard.spread(20);
        System.out.println( hubbard );

        hubbard.select(3);
        hubbard.spread(40);
        System.out.println( hubbard );
    }
}