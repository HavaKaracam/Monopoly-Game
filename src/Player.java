public class Player {

    //create player attributes
     int id;
     int money;//player's total cash money
     int totalDebt;//player's debt to bank and other players
     Property[] property = new Property[40];//player's properties
     int totalAssetPrice;//player's total asset value including cash and property values
     int debtToPlayers;//player's debt to other players
     int debtToBanks;//player'S debt to bank
     int currentLocation = 0;//player's current location
     boolean isJail=false;//is that player in jail or not
     boolean isBankruptcy=false;//is that player has bankrupted or not

    public Player(int id, int money) {
        this.id = id;
        this.money = money;
    }
}
