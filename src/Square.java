public class Square {

    //creating square attributes
    String description;//square description in a nutshell
    //square for containing properties or cards
    Property property = new Property();
    Card card = new Card();

    //getter and setter
    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    //change the player's location by 3 when this card pulled
    public void goToSquare(Card goToCard, Player player){

        player.currentLocation -=3;
    }

    //add 100 dollars to the player when is card pulled
    public void gain100Dollars(Card gain100Dollars, Player player){

        player.money +=100;
    }

    //take 50 dollars of doctor fee then this card pulled
    public void doctorFee (Card doctorFee, Player player){
        player.money -=50;
    }

    //send player to the jail
    public void goToJail(){}



}
