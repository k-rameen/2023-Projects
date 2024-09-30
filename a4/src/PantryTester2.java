public class PantryTester2{

    public static void main ( String[] args )  {

        Jam goose = new Jam( "Gooseberry", "7/4/86", 120 );
        Jam apple = new Jam( "Crab Apple", "9/30/99", 80 );


        //object that takes two jam parameters
        Pantry2 hubbard = new Pantry2( goose, apple );

        System.out.println("Pantry:" + "\n" + hubbard );

        System.out.println("First selection: 1 Spread: 2 ml " + "\n");

        if ( hubbard.select(1) )
            hubbard.spread(2);

        else
            System.out.println("Selection not available");
        System.out.println( hubbard );

        System.out.println("Second selection: 3 Spread: 5 ml " + "\n");

        if ( hubbard.select(3) )
            hubbard.spread(5);

        else
            System.out.println("Selection not available");
        System.out.println( hubbard );

        System.out.println("Third selection: 1 Spread: 120 ml " + "\n");

        if ( hubbard.select(1) )
            hubbard.spread(120);

        else
            System.out.println("Selection not available");
        System.out.println( hubbard );

        System.out.println("Fourth selection: 2 Spread: 10 ml " + "\n");

        if ( hubbard.select(2) )
            hubbard.spread(10);

        else
            System.out.println("Selection not available");
        System.out.println( hubbard );

        //objects takes goose jam parameter
        Pantry2 hubbardTwo = new Pantry2( goose );
        System.out.println("Pantry :" + "\n" + hubbardTwo );

        System.out.println("First selection: 1 Spread: 10 ml " + "\n");

        if ( hubbardTwo.select(1) )
            hubbardTwo.spread(10);

        else
            System.out.println("Selection not available");
        System.out.println( hubbardTwo );

        System.out.println("Second selection: 2 Spread: 7 ml " + "\n");

        if ( hubbardTwo.select(2) )
            hubbardTwo.spread(7);

        else
            System.out.println("Selection not available");
        System.out.println( hubbardTwo );

        System.out.println("Third selection: 3 Spread: 30 ml " + "\n");

        if ( hubbardTwo.select(3) )
            hubbardTwo.spread(30);

        else
            System.out.println("Selection not available");
        System.out.println( hubbardTwo );

        //object takes apple jam parameter
        Pantry2 hubbardThree = new Pantry2( apple );
        System.out.println("Pantry :" + "\n" + hubbardThree );

        System.out.println("First selection: 1 Spread: 49 ml " + "\n");

        if ( hubbardThree.select(1) )
            hubbardThree.spread(49);

        else
            System.out.println("Selection not available");
        System.out.println( hubbardThree );

        System.out.println("Second selection: 2 Spread: 8 ml " + "\n");

        if ( hubbardThree.select(2) )
            hubbardThree.spread(8);

        else
            System.out.println("Selection not available");
        System.out.println( hubbardThree );

        System.out.println("Third selection: 7 Spread: 40 ml " + "\n");

        if ( hubbardThree.select(7) )
            hubbardThree.spread(40);

        else
            System.out.println("Selection not available");
        System.out.println( hubbardThree );
    }
}