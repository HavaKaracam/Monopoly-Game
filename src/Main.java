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
            Property Besiktas = new Property(200,100,400,400,"Red");
            squares[21].description = "Beşiktaş ($220) - Red";
            squares[22].description = "Chance";
            squares[23].description = "Ortaköy ($220) - Red";
            Property Ortakoy = new Property(220,110,440,440,"Red");
            squares[24].description = "Bebek ($240) - Red";
            Property Bebek = new Property(240,120,480,480,"Red");
            Property Marmaray = new Property(200,100,400,"White");
            squares[25].description = "Marmaray istasyonu ($200)";

            squares[26].description = "Beylikdüzü ($260) - Yellow";
            Property Beylikduzu = new Property(260,130,520,520,"Yellow");
            squares[27].description = "Avcılar ($260) - Yellow";
            Property Avcılar = new Property(260,130,520,520,"Yellow");
            squares[28].description = "İski ($150)";
            Property Iski = new Property(150,75,300,"White");
            squares[29].description = "Küçükçekmece ($280) - Yellow";
            Property Kucukcekmece = new Property(280,140,560,560,"Yellow");
            squares[30].description = "Go to Jail";
            squares[31].description = " Fatih($300) - Green";
            Property Fatih = new Property(300,150,600,600,"Green");
            squares[32].description = " Taksim($300) - Green";
            Property Taksim = new Property(300,150,600,600,"Green");
            squares[33].description = "Community Chest";
            Property Karakoy = new Property(300,150,600,600,"Green");
            squares[34].description = " Karaköy($300) - Green";
            squares[35].description = "Durak ($200)";
            Property Durak = new Property(200,100,400,"White");
            squares[36].description = "Chance";
            squares[37].description = " Dudullu($350) - NavyBlue";
            Property Dudullu = new Property(350,175,700,700,"NavyBlue");
            squares[38].description = " Tax (75) ";
            squares[39].description = " Tuzla($400) - NavyBlue";
            Property Tuzla = new Property(400,200,400,800,"NavyBlue");
        }



    }
}
