import java.util.Scanner;

public class Monopoly {
    public static void main(String[] args) {

        //initialize the scanner to get input from user
        Scanner input = new Scanner(System.in);

        Board board = new Board();
        Dice dice = new Dice();

        board.initializeGame();

        //getting input from user to indicate how many players they are
        System.out.print("How many players you want to play: "); //prompt user to get input
        int playerNumber = input.nextInt();//get the input

        Player[] playerArray = new Player[playerNumber];//create input sized player array

        //create the objects of player for each player and give them $2000 for beginning
        for(int i=0; i < playerNumber; i++){
            playerArray[i] = new Player(i, 2000);
        }


        //create a while loop to game continue until the user ends
        outerloop://label the while loop to break it when user wants
        while(true) {

            //create a for loop to loop for the number of players
            for (int currentPlayer = 0; currentPlayer < playerArray.length; currentPlayer++) {

                int currentDice = dice.roll();//roll the dice and assign to a local variable

                System.out.println("Player" + currentPlayer + "'s turn. Player's dice is " + currentDice);//print the current player and his/her dice

                //move the player by the number of dice and print which square she/he is on
                playerArray[currentPlayer].setCurrentLocation(playerArray[currentPlayer].getCurrentLocation() + currentDice);

                //if player exceeds the number of squares. he come to the start point and start again. and earn $200
                if (playerArray[currentPlayer].getCurrentLocation() > 39) {
                    playerArray[currentPlayer].setCurrentLocation(playerArray[currentPlayer].getCurrentLocation() - 40);
                    playerArray[currentPlayer].setMoney(playerArray[currentPlayer].getMoney() + 200);
                    System.out.println("You have just passed the start point and earned 200 dollars");
                }

                System.out.println("Player " + currentPlayer + " is current on " + board.getSquares()[playerArray[currentPlayer].getCurrentLocation()].getDescription() + " square");

                //when player come to a property square.
                if (board.getSquares()[playerArray[currentPlayer].getCurrentLocation()].getProperty().getColor() != null) {//property check
                    System.out.println("Your money before the purchase is: " + playerArray[currentPlayer].getMoney());//print the players money before the purchase
                    System.out.println("Do you want to purchase this property. Press y for yes");//prompt the user if she/he wants to buy this property
                    String answer = input.next();//get the answer

                    //if player accept the purchase. the cost of the property will be taken from the player
                    if (answer.contentEquals("y")) {

                        playerArray[currentPlayer].setMoney(playerArray[currentPlayer].getMoney() - board.getSquares()[playerArray[currentPlayer].currentLocation].getProperty().getPrice());//take the player's money
                        System.out.println("Your money after the purchase is: " + playerArray[currentPlayer].getMoney());//print the players money after the purchase

                    }

                }//property check

                //ask players at the end of each turn if they want to finish the gamae
                System.out.println("If you want to finish the game type 'end' otherwise press anykey");
                String endGame = input.next();

                //when user typed end
                if (endGame.contentEquals("end")) {

                    //print the each players money
                    for (int playerNum = 0; playerNum<playerArray.length; playerNum++){
                        System.out.println("Player " + playerArray[playerNum].getId() + " money is $" + playerArray[playerNum].getMoney());
                    }

                    //break the while loop and terminate the game
                    break outerloop;
                }

                System.out.println("* * * * * * * * * * *");
            }


        }



    }


    //method for the pull randomly card when chance of community squares come
    public static Card pullRandomCard(Card[] cards){

        int randomNumber = (int)(2*Math.random());

        return cards[randomNumber];
    }

}


