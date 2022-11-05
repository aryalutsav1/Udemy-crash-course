package udemyvideopractice;

public class IfElseStatements {
    public static void main(String[] args){
        int score =800;
        int levelCompleted = 5;
        int bonus = 100;
        boolean gameOver =true;

        if (gameOver){
            int finalScore = score +(levelCompleted*bonus);
            System.out.println("Your final score is "+ finalScore);

            int secondScore = 10000;
            levelCompleted=8;
            bonus=200;
            finalScore = secondScore+(levelCompleted*bonus);
            System.out.println("Your second score is "+ finalScore);
        }
    }
}

