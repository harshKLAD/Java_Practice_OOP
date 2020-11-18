package Harsh;
import java.util.ArrayList;

public class Ship {
    private ArrayList<String> locationCells;

    //int numOfHits = 0;

    public String check(String guess){
        int guessInt = Integer.parseInt(guess);

        String result = "miss";

        int index = locationCells.indexOf(userInput);

        if(index > 0){
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            }else {
                result = "hit";
            }
        }
//        for(int cell : locationCells){
//
//            if(guessInt == cell){
//                result = "hit";
//                numOfHits++;
//                break;
//            }
//        }
//        if(numOfHits == locationCells.length){
//            result = "kill";
//        }
//        System.out.println(result);

        return result;
    }


    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }
}
