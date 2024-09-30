public class PantryTester3{
    public static void main ( String[] args )  {

        Jam goose = new Jam( "Gooseberry", "7/4/86", 120 );
        Jam apple = new Jam( "Crab Apple", "9/30/99", 80 );
        Jam rhub  = new Jam( "Rhubarb", "10/31/99", 160 );

        Pantry3 hubbard = new Pantry3( goose, apple );

        System.out.println( hubbard );

        System.out.println("First selection: 3 Spread: 20 ml" + "\n");

        if ( hubbard.select(3) )
            hubbard.spread(20);

        else
            System.out.println("Selection not available" + "\n");
        System.out.println( hubbard );

        System.out.println("Replace: 3 with 3" + "\n");

        //replaces the third slot with rhub jam
        hubbard.replace( rhub, 3 );
        System.out.println( hubbard );

        System.out.println("Spread: 20 ml of Rhubarb" + "\n");

        if ( hubbard.select(3) )
            hubbard.spread(20);

        else
            System.out.println("Selection not available" + "\n" );

        System.out.println( hubbard + "\n");

        Pantry3 hubbardTwo = new Pantry3( goose );

        System.out.println( hubbardTwo );

        System.out.println("Second selection: 1 Spread: 10 ml" + "\n");

        if ( hubbardTwo.select(1) )
            hubbardTwo.spread(10);

        else
            System.out.println("Selection not available" + "\n");

        System.out.println("\n" + hubbardTwo );

        System.out.println("Replace: Gooseberry with Crab Apple" + "\n");

        //replaces the first slot with the second
        hubbardTwo.replace( apple, 1 );
        System.out.println( hubbardTwo );

        if ( hubbardTwo.select(1) )
            hubbardTwo.spread(10);

        else
            System.out.println("Selection not available" + "\n");

        System.out.println("\n" + hubbardTwo );

        Pantry3 hubbardThree = new Pantry3(goose, apple, rhub);

        System.out.println( hubbardThree );

        System.out.println("Third selection: 1 Spread: 15 ml" + "\n");

        if ( hubbardThree.select(1) )
            hubbardThree.spread(15);

        else
            System.out.println("Selection not available" + "\n");

        System.out.println("\n" + hubbardThree );

        System.out.println("\n" + "Replace Gooseberry with Apple, Apple with Rhubarb, and Rhubarb with Gooseberry" + "\n");

        hubbardThree.replace( apple, 1 );

        hubbardThree.replace( rhub, 2 );

        hubbardThree.replace( goose, 3 );

        System.out.println( hubbardThree);

        System.out.println("\n" + "Select: 1 Spread: 20 ml" + "\n");

        if ( hubbardThree.select(1) )
            hubbardTwo.spread(20);

        else
            System.out.println("Selection not available" + "\n");

        System.out.println( hubbardThree);

        System.out.println("\n" + "Select: 2 Spread: 7 ml" + "\n");

        if ( hubbardThree.select(2) )
            hubbardThree.spread(7);

        else
            System.out.println("Selection not available" + "\n");

        System.out.println( hubbardThree);

        System.out.println("\n" + "Select: 3 Spread: 2 ml" + "\n");

        if ( hubbardThree.select(3) )
            hubbardThree.spread(2);

        else
            System.out.println("Selection not available" + "\n");

        System.out.println("\n" + hubbardThree);

        System.out.println("\n" + "Select: 5 Spread: 2 ml" + "\n");

        if ( hubbardThree.select(5) )
            hubbardThree.spread(2);

        else
            System.out.println("Selection not available" + "\n");

        System.out.println("\n" + "Select: 3 Spread: 100 ml" + "\n");

        if ( hubbardThree.select(3) )
            hubbardThree.spread(100);

        else
            System.out.println("Selection not available" + "\n");

        System.out.println("\n" + hubbardThree);

    }
}