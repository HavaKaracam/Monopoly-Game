public class Player {

    //create player attributes
    private int id;
    private int money;//player's total cash money
    private int totalDebt;//player's debt to bank and other players
    private Property[] property = new Property[40];//player's properties
    private int totalAssetPrice;//player's total asset value including cash and property values
    private int debtToPlayers;//player's debt to other players
    private int debtToBanks;//player'S debt to bank
    private int currentLocation = 0;//player's current location
    private boolean isJail=false;//is that player in jail or not
    private boolean isBankruptcy=false;//is that player has bankrupted or not

    public Player(int id, int money) {
        this.id = id;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getTotalDebt() {
        return totalDebt;
    }

    public void setTotalDebt(int totalDebt) {
        this.totalDebt = totalDebt;
    }

    public Property[] getProperty() {
        return property;
    }

    public void setProperty(Property[] property) {
        this.property = property;
    }

    public int getTotalAssetPrice() {
        return totalAssetPrice;
    }

    public void setTotalAssetPrice(int totalAssetPrice) {
        this.totalAssetPrice = totalAssetPrice;
    }

    public int getDebtToPlayers() {
        return debtToPlayers;
    }

    public void setDebtToPlayers(int debtToPlayers) {
        this.debtToPlayers = debtToPlayers;
    }

    public int getDebtToBanks() {
        return debtToBanks;
    }

    public void setDebtToBanks(int debtToBanks) {
        this.debtToBanks = debtToBanks;
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }

    public boolean isJail() {
        return isJail;
    }

    public void setJail(boolean jail) {
        isJail = jail;
    }

    public boolean isBankruptcy() {
        return isBankruptcy;
    }

    public void setBankruptcy(boolean bankruptcy) {
        isBankruptcy = bankruptcy;
    }

}
