package udemyvideopractice;

public class MethodPractice {

    public static void main (String[] args){

        calculateScore(true,800,5,100);
        calculateScore(true, 10000,8,200);
        calculateScore(false,10000,8,200);

    }
    public static int calculateScore(boolean gameOver, int score, int level, int bonus){
        int finalScore=0;
        if (gameOver){
            finalScore = score+ (level*bonus);
            System.out.println(finalScore);
            return finalScore +=2000;
        }
        return -1;

    }
}
