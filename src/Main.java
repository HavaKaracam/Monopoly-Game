import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many players you want to play: ");
        int playerNumber = input.nextInt();
        Player[] playerArray = new Player[playerNumber];

        for(int i=0; i < playerNumber; i++){
            playerArray[i] = new Player(i);
        }

        Dice dice = new Dice((int)(6*Math.random() + 1), (int)(6*Math.random() + 1));


        Card goToJail = new Card();
        goToJail.setGoToSquare(30);

        Card threeBackSquare = new Card();
        threeBackSquare.setGoToSquare(threeBackSquare.player.currentLocation - 3);

        Card gain100Dollars = new Card();
        gain100Dollars.setPrice(100);

        Card doctorFee = new Card();
        doctorFee.setPrice(50);

        Card lottery = new Card();
        lottery.setPrice(100);

        Card goToStart = new Card();
        goToStart.setGoToSquare(0);

        Property istiklalCaddesi = new Property();



        Square[] squares = new Square[40];
        for(int playerNum = 0; playerNum<4; playerNum++) {


            squares[0].description = "Go collect Money";

            squares[1].description = "İstiklal Caddesi ($80) - Purple";

            squares[2].description = "Community Chest";

            squares[3].description = "Baltık Caddesi ($60) - Purple";

            squares[4].description = "Income Tax (Pay $200)";

            squares[5].description = "Hızlı Tren İstasyonu ($300)";

            squares[6].description = "İsmet Paşa Caddesi ($100) - Blue";

            squares[7].description = "Chance";

            squares[8].description = "Millet Caddesi ($100) - Blue";

            squares[9].description = "Akdeniz Caddesi ($120) - Blue";

            squares[10].description = "Jail/Just visiting";

            squares[11].description = "Eyüp ($140) - Pink";

            squares[12].description = "Elektrik şirkeri ($150)";

            squares[13].description = "Kadıköy ($140) - Pink";

            squares[14].description = "Üsküdar ($160) - Pink";
            squares[15].description = "Metro istasyonu ($200)";
            squares[16].description = "Ümraniye ($180) - Orange";
            squares[17].description = "Community Chest";
            squares[18].description = "Maltepe ($180) - Orange";
            squares[19].description = "Pendik ($200) - Orange";
            squares[20].description = "Free Parking";
            squares[21].description = "Beşiktaş ($220) - Red";
            squares[22].description = "Chance";
            squares[23].description = "Ortaköy ($220) - Red";
            squares[24].description = "Bebek ($240) - Red";
            squares[25].description = "Marmaray istasyonu ($200)";
            squares[26].description = "Beylikdüzü ($260) - Yellow";
            squares[27].description = "Avcılar ($260) - Yellow";
            squares[28].description = "İski ($150)";
            squares[29].description = "Küçükçekmece ($280) - Yellow";
            squares[30].description = "Go to Jail";
            squares[31].description = " Fatih($300) - Green";
            squares[32].description = " Taksim($300) - Green";
            squares[33].description = "Community Chest";
            squares[34].description = " Karaköy($300) - Green";
            squares[35].description = "Durak ($200)";
            squares[36].description = "Chance";
            squares[37].description = " Dudullu($350) - NavyBlue";
            squares[38].description = " Tax (75) ";
            squares[39].description = " Tuzla($400) - NavyBlue";
        }



    }
}
