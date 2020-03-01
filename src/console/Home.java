package console;

/*  Home Class (14 marks)
• Create an abstract class called Home. (2 marks) ok
• Give the class three instance variables that cannot be accessible outside of the class. (3 marks) ok
• Create the necessary accessors and mutators for these instance variables. (3 marks) ok
• Create 3 constructors in total for Home class. (3 marks) did more
• Create any abstract method that returns a non-void value. It accepts one argument. (2 marks)  ok
• Override the default implementation of the toString to summarize the 3 instance variables of Home (1 mark) ok*/


abstract class Home {
    private int bedrooms = 0;
    private double price = 0.0;

    // changed enum to public
    public enum HouseType {BUNGALOW, DEFAULT, DUPLEX, MANSION, RANCH, SPLIT_LEVEL};
    HouseType houseType = HouseType.DEFAULT;

    // abstract method
    public abstract boolean checkBedrooms(int roomNumber);

    // toString()
    @Override
    public String toString() {
        return "Number of Bedrooms: \t" + getBedrooms() + "\n" +
                "House Type:  \t\t\t\t\t" + getHouseType() + "\n" +
                "Price:  \t\t\t\t\t\t\t\t$" + getPrice() + "\n";
    }

    // Constructors

    public Home() {}

    public Home(int bedrooms, HouseType houseType, double price) {
        this.bedrooms = bedrooms;
        this.houseType = houseType;
        this.price = price;
    }
    public Home(int bedrooms, HouseType houseType) {
        this.bedrooms = bedrooms;
        this.houseType = houseType;;
    }
    public Home(int bedrooms, double price) {
        this.bedrooms = bedrooms;
        this.price = price;
    }
    public Home(HouseType houseType, double price) {
        this.houseType = houseType;
        this.price = price;
    }
    public Home(HouseType houseType) {
        this.houseType = houseType;
    }
    public Home(int bedrooms) {
        this.bedrooms = bedrooms;
    }
    public Home(double price) {
        this.price = price;
    }

    // getters

    public int getBedrooms() {
        return bedrooms;
    }

    public Enum<HouseType> getHouseType() {
        return houseType;
    }

    public double getPrice() {
        return price;
    }

    // setters

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}