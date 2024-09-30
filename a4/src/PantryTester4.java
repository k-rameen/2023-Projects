public class PantryTester4{
    public static void main ( String[] args )  {

        Jam goose = new Jam( "Gooseberry", "7/4/86", 40 );
        Jam apple = new Jam( "Crab Apple", "9/30/99", 10 );
        Jam rhub  = new Jam( "Rhubarb", "10/31/99", 20 );

        Pantry4 hubbard = new Pantry4( goose, apple, rhub );

        System.out.println( hubbard );

        if ( hubbard.select(1) )
            hubbard.spread(20);
        else
            System.out.println("Selection not available");

        System.out.println("\n" + hubbard );

        //creates the mixed fruit jam into slot 1
        hubbard.mixedFruit();

        System.out.println( hubbard );

        //checking goose and apple parameters
        Pantry4 hubbardTwo = new Pantry4( goose, apple);

        System.out.println( hubbardTwo );

        if ( hubbardTwo.select(2) )
            hubbardTwo.spread(2);
        else
            System.out.println("Selection not available");

        System.out.println("\n" + hubbardTwo );

        //calls the mixedFruit method to check and create the mixed fruit jam if the requirements are met
        hubbardTwo.mixedFruit();

        System.out.println("\n" + hubbardTwo );

        //checking the goose parameter
        Pantry4 hubbardThree = new Pantry4( goose);

        System.out.println( hubbardThree );

        if ( hubbardThree.select(1) )
            hubbardThree.spread(1);
        else
            System.out.println("Selection not available");

        System.out.println("\n" + hubbardThree );

        hubbardThree.mixedFruit();

        System.out.println("\n" + hubbardThree );

        Pantry4 hubbardFour = new Pantry4( goose, apple, rhub );

        System.out.println( hubbardFour );

        if ( hubbardFour.select(1) )
            hubbardFour.spread(5);
        else
            System.out.println("Selection not available");
        //spreading maximum amount to check if the mixed fruit jar will still print
        if ( hubbardFour.select(2) )
            hubbardFour.spread(8);
        else
            System.out.println("Selection not available");

        if ( hubbardFour.select(3) )
            hubbardFour.spread(2);
        else
            System.out.println("Selection not available");

        System.out.println("\n" + hubbardFour );

        hubbardFour.mixedFruit();

        System.out.println("\n" + hubbardFour );

    }
}
