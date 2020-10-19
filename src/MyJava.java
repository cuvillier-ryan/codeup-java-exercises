public class MyJava {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your high score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Ryan", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Rita", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Amber", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Parker", highScorePosition);


        checkNumber(5);
        checkNumber(-5);
        checkNumber(0);

        fizzBuzz();


        //the end of the main method
    }

    //    This section is talking about methods in Java
//    When creating a method, when needed, use parameters to call arguments later.
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int hsPosition) {
        System.out.println(playerName + " managed to get into position " + hsPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;
        int position = 4; // assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println("zero");
        }
    }

    public static void fizzBuzz() {
        for (int num = 1; num <= 100; num++) {
            if (num % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(num);
            }
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (barking == false || hourOfDay < 0 || hourOfDay > 23){
            return false;
        }else if(barking == true && hourOfDay >= 0 && hourOfDay < 8){
            return true;
        }else if(barking == true && hourOfDay >= 22 && hourOfDay < 23){
            return true;
        }
    }


    //There is more to do with Java
}

