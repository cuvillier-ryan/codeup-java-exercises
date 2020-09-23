public class MyJava {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        final float PI = 3.14F;


        boolean gamoeOVer = true;
        int score = 900;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("You score was less than 1000");
        } else {
            System.out.println("This is the last resort");
        }


    }
}