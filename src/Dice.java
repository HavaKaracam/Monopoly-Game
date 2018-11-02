import java.util.*;

public class Dice {

    private int dice1;
    private int dice2;
    private int total = dice1 + dice2;
   // dice1  = (int)(6*Math.random() + 1);


    public Dice(int dice1, int dice2) {
        this.dice1 = dice1;
        this.dice2 = dice2;
    }

    public int getDice1() {
        return dice1;
    }

    public void setDice1(int dice1) {
        this.dice1 = dice1;
    }

    public int getDice2() {
        return dice2;
    }

    public void setDice2(int dice2) {
        this.dice2 = dice2;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
int rollDice(int dice1, int dice2){
        this.dice1=(int)(Math.random()*6+1);
        System.out.print("First dice: "+ dice1);
        this.dice2=(int)(Math.random()*6+1);
        System.out.println("Second dice: "+ dice2);
        this.total=dice1+dice2;
        System.out.println("You will move on "+ total+ " square.");
        return total;
}
}
