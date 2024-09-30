class Toy {
    protected String name;  // name of the type of toy, select 1 for doll, 2 for car
    protected double price;  // price of the toy
    protected String category; // superheroes, cars, dolls, animals etc.

    // constructor to input name
    public Toy( String nm )  {
        name = nm; price = 15.00; category = "N/A";
    }
    // constructor to input name and price
    public Toy( String nm, double prc, String cat  )  {
        name = nm; price = prc; category = cat;
    }
    //method allows the user to play with the toy
    public String playing(){
        return "You are playing with " + name;
    }
    //method states toy information
    public String toString() {
        return name + ", " + "Price: $" + price + " Category: " + category;
    }
    //Setters and Getters
    //gets the name
    public String getName() {
        return name;
    }

    //sets name
    public void setName( String nm ) {
        name = nm;
    }

    //gets price
    public double getPrice() {
        return price;
    }

    //sets price
    public void setPrice( double prc ) {
        price = prc;
    }

    //gets category
    public String getCategory() {
        return category;
    }

    //sets category
    public void setCategory( String cat ) {
        category = cat;
    }
}