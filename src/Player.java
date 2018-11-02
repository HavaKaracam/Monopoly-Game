public class Player {
     private int id;
    private  int money;
   private   int totalDebt;
     Property property[]=new Property [60];

    private  int totalAssetPrice;
   private  int debtToPlayers;
    private  int debtToBanks;
  private   int currentLocation;
    private  boolean isJail=false;
    private  boolean isBankruptcy=false;

    public Player(int id) {
        this.id = id;
    }
    public int increaseTheMoney(int amount){
        return this.money+amount;
    }
}
