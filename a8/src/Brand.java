/*
This class is an extension of Doll, it acts to advertise the doll items under a brand and ad 
*/
class Brand extends Doll{
    private String brandName;     // bratz, barbie or monster high
    private double advertise;   // cost to advertise the brand

    // constructor
    public Brand( String nm, double prc, String hairClr, String clth, String brandNm, double ad )  {
        super( nm, prc, hairClr, clth );	// use the base class's constructor to initialize members inherited from it
        brandName = brandNm;// initialize what's new to Brand
        advertise = ad;
    }
    public String toString() {
        return super.toString() + "\nBrand name: " + getBrandName() + ", Advertising cost: $" + getAd();
    }
    //brushes the name of the doll's hair
    public String CompanyAd() {
        return "We sell dolls at " + brandName + "! Call 905-455-9281 for any questions.";
    }
    //gets brand name
    public String getBrandName() {
        return brandName;
    }
    //sets brand name
    public void setBrandName( String brandNm ) {
        brandName = brandNm;
    }
    //gets ad
    public double getAd() {
        return advertise;
    }
    //sets ad price
    public void setAd( double ad ) {
        advertise = ad;
    }
}