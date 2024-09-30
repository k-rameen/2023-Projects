/* 
The storage class acts as a unit that stores multiple different toys, including car and doll, that will be sent to the "Toy Store"
*/
class Storage
{
    // Instance Variables
    private Car car1;
    private Doll doll1;
    private Toy toy1;
    private String address; //location of the storage unit
    private String storageName; //name of the building

    //initializes the variables in the parameters
    public Storage(Car car1, Doll doll1, Toy toy1, String address, String storageName) {
        this.car1 = car1;
        this.doll1 = doll1;
        this.toy1 = toy1;
        this.address = address;
        this.storageName = storageName;
    }
    //adds up all the prices of the toys to be sent to the store
    public String totalCost() {
        return "All toy expenses: $" + (car1.getPrice() + doll1.getPrice() + toy1.getPrice());
    }
    public String toString() {
        return car1.toString() + "\n" + "\n" + doll1.toString() + "\n" + "\n" + toy1.toString() + "\n" + "\n"  + "These toys are stored in " + storageName + ", " + address;
    }
}