import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dice dice = new Dice((int)(6*Math.random() + 1), (int)(6*Math.random() + 1));

        Scanner input = new Scanner(System.in);

        System.out.print("How many players you want to play: ");
        int playerNumber = input.nextInt();
        Player[] playerArray = new Player[playerNumber];

        for(int i=0; i < playerNumber; i++){
            playerArray[i] = new Player(i);
        }

        Square[] squares = new Square[40];

        squares[0].description = "Go collect Money";

        squares[1].description = "İstiklal Caddesi ($80) - Purple";

        squares[2].description = "Community Chest";

        squares[3].description = "Baltık Caddesi ($60) - Purple";

        squares[4].description = "Income Tax (Pay $200)";

        squares[5].description = "Hızlı Tren İstasyonu ($300)";

        squares[6].description = "İsmet Paşa Caddesi ($100) - Blue";




    }
}
