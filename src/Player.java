public class Player {
    int id;
    int money;
    int totalDebt;
    Property property[]=new Property [60];
    int totalAssetPrice;
    int debtToPlayers;
    int debtToBanks;
    int currentLocation = 0;
    boolean isJail=false;
    boolean isBankruptcy=false;

    public Player(int id, int money) {
        this.id = id;
        this.money = money;
    }
}
