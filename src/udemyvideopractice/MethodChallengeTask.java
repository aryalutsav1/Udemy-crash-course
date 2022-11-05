package udemyvideopractice;

public class MethodChallengeTask {
    /*
    this task
    1- create metnod displayHighScorePosition with two parameter playerName and position and it should display
    message like -
    "name of the player" managed to get into position "position" on the high score table.
    2- another method displayHighScorePosition returning int.
    return 1 if score >=1000.
    return 2 if 500=<score<1000
    return 3 if 100=<score<500
    return 4 for all other cases
    3- print result for 1500,900,400,50
     */
    public static void main(String[] args){
        displayHighScorePosition("Utsav", calculateHighScorePosition(1500));
        displayHighScorePosition("Aryal", calculateHighScorePosition(900));
        displayHighScorePosition("Shiddhi", calculateHighScorePosition(400));
        displayHighScorePosition("Acharya", calculateHighScorePosition(50));

    }
    public static void displayHighScorePosition(String playersName, int position){
        System.out.println(playersName+" managed to get into position "+ position+" on the high score table.");
    }
    public static int calculateHighScorePosition(int score) {
        int position = 0;
        if (score>1000){
            return position =1;
        } else if (score <1000 && score >500) {
            return position=2;
        } else if (score <500 && score>100) {
            return position=3;
        }
        else {
            return position=4;
        }


    }
}
