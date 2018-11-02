class Property {
    private String propertyName;
    private int price;
    private int rent;
    private int housePrice;
    private int house;
    private int mortgagePrice;
    String color;
    boolean isMortgage=false;
    boolean hasOwner=false;

    public Property(){

    }

    public Property(int price, int rent, int housePrice, int mortgagePrice, String color) {
        this.price = price;
        this.rent = rent;
        this.housePrice = housePrice;
        this.house = house;
        this.mortgagePrice = mortgagePrice;
        this.color = color;
    }

    public Property(int price, int rent, int mortgagePrice, String color) {
        this.price = price;
        this.rent = rent;
        this.mortgagePrice = mortgagePrice;
        this.color = color;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(int housePrice) {
        this.housePrice = housePrice;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getMortgagePrice() {
        return mortgagePrice;
    }

    public void setMortgagePrice(int mortgagePrice) {
        this.mortgagePrice = mortgagePrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMortgage() {
        return isMortgage;
    }

    public void setMortgage(boolean mortgage) {
        isMortgage = mortgage;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }
}
