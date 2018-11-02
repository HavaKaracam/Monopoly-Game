public class Card {

    //create card attributes

    int price;//create price for cards that gives or takes price
    int goToSquare;//create integer for how many squares player jump when the proper card pulled
    Player player;//take player for this cards

    //getter setter
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getGoToSquare() {
        return goToSquare;
    }

    public void setGoToSquare(int goToSquare) {
        this.goToSquare = goToSquare;
    }
}
