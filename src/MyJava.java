import java.util.Scanner;

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

    public static void fizzBuzz(int num) {
        for (num = 1; num <= 100; num++) {
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

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking || hourOfDay < 0 || hourOfDay > 23)
            return false;
        else return hourOfDay < 8 || hourOfDay > 22;
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }


    public static boolean isLeapYear(int year) {
        if (year <= 1 || year >= 9999) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 100 == 0 && year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if ((int) (num1 * 1000) == (int) (num2 * 1000)) {
        return true;
        }
        return false;
    }

    public static boolean hasEqualSum(int num1, int num2, int num3){
        int sumNum1Num2 = num1 + num2;
        if(sumNum1Num2 == num3){
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int num1, int num2, int num3){
        if(num1 >= 13 && num1 <= 19){
            return true;
        }else if(num2 >= 13 && num2 <= 19){
            return true;
        }else if(num3 >= 13 && num3 <= 19){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int num1){
        if(num1 >= 13 && num1 <= 19){
            return true;
        }
        return false;
    }

//    Method Overloading Udemy Challenge

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >= 0){
            return feet * 30.48;
        }else if(inches >= 0 && inches <= 12){
            return inches * 2.54;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){

        }
        return -1;
    }









//        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
//            return true;
//        }
//        return false;
//    }
}

