package console;
/* Apartment Class (15 marks)
• Create a class called Apartment that is based on the Home class. ok (2 marks) ok
• Give the class two additional instance variables that can be accessed outside of the class (your choice) (2 marks) ok
• Allow the Apartment class to be constructed like the Home class. (3 marks)
• Add 2 more constructors to the Apartment class that will initialize values of the additional instance variables. (2 marks)
• Override one of the accessors of the Home class to return 3 times the instance variable value or the instance variable value repeated three times (depending on data type). (2 marks)
• Develop the abstract method. Be as creative as you desire. (2 marks)
• Override the toString to include the summary of the two new instance variables of Apartment (2 marks) */

// not stated:  build Runner file to test.


public class Apartment extends Home implements Pool, Backyard {

    // class variables
    public boolean hasFireplace;
    public String neighbourhood;

    // constructors
    public Apartment(boolean hasFireplace, String neighbourhood) {
        super();
        this.hasFireplace = hasFireplace;
        this.neighbourhood = neighbourhood;
    }
    // something is wrong with enum constructors

    public Apartment(int bedrooms, Home.HouseType houseType, double price, boolean hasFireplace, String neighbourhood) {
        super(bedrooms, houseType, price);
        this.hasFireplace = hasFireplace;
        this.neighbourhood = neighbourhood;
    }

    public Apartment(int bedrooms, Home.HouseType houseType, boolean hasFireplace, String neighbourhood) {
        super(bedrooms, houseType);
        this.hasFireplace = hasFireplace;
        this.neighbourhood = neighbourhood;
    }

    public Apartment(int bedrooms, double price, boolean hasFireplace, String neighbourhood) {
        super(bedrooms, price);
        this.hasFireplace = hasFireplace;
        this.neighbourhood = neighbourhood;
    }

    public Apartment(Home.HouseType houseType, double price, boolean hasFireplace, String neighbourhood) {
        super(houseType, price);
        this.hasFireplace = hasFireplace;
        this.neighbourhood = neighbourhood;
    }

    public Apartment(Home.HouseType houseType, boolean hasFireplace, String neighbourhood) {
        super(houseType);
        this.hasFireplace = hasFireplace;
        this.neighbourhood = neighbourhood;
    }

    public Apartment(int bedrooms, boolean hasFireplace, String neighbourhood) {
        super(bedrooms);
        this.hasFireplace = hasFireplace;
        this.neighbourhood = neighbourhood;
    }

    public Apartment(double price, boolean hasFireplace, String neighbourhood) {
        super(price);
        this.hasFireplace = hasFireplace;
        this.neighbourhood = neighbourhood;
    }

    public Apartment(boolean hasFireplace) {
        super();
        this.hasFireplace = hasFireplace;
    }

    public Apartment(String neighbourhood) {
        super();
        this.neighbourhood = neighbourhood;
    }

    public Apartment() {super();}

    // method implementation from interfaces

    @Override
    public boolean checkBedrooms(int roomNumber) {
        return (roomNumber > 0 && roomNumber < 100);
    }

    @Override
    public int poolCleanUpTimesPerYear() {
        if (hasPool) return 0;
        return 12;
    }

    @Override
    public double poolMaintenanceCost() {
        if (hasPool) return 0.0;
        return 2400.0;
    }

    // toString()
    @Override
    public String toString() {
        return "Number of Bedrooms: \t" + getBedrooms() + "\n" +
                "House Type:  \t\t\t\t\t" + getHouseType() + "\n" +
                "Price:  \t\t\t\t\t\t\t\t$" + getPrice() + "\n" +
                "Fireplace:  \t\t\t\t\t\t" + hasFireplace + "\n" +
                "Neighbourhood:  \t\t\t" + neighbourhood + "\n";
    }

    @Override
    public int yardCleanUpTimesPerYear() {
        if (hasBackyard) return 0;
        return 12;
    }

    @Override
    public double yardMaintenanceCost() {
        if (hasBackyard) return 0;
        return 3600;
    }
}



