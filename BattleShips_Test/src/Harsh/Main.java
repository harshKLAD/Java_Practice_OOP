package Harsh;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        Ship theDotCom = new Ship();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.check(guess);
            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses"); }

        }
    }

}
