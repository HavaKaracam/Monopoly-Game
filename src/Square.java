public class Square {

    String description;
    Property property = new Property();
    Card card = new Card();

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

    public void goToSquare(Card goToCard, Player player){

        player.currentLocation -=3;
    }

    public void gain100Dollars(Card gain100Dollars, Player player){

        player.money +=100;
    }

    public void doctorFee (Card doctorFee, Player player){
        player.money -=50;
    }

    public void goToJail(){}



}
