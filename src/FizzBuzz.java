public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }

        }

        for (int k = 1; k <= 50; k++) {
            if (k % 3 == 0 && k % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (k % 3 == 0) {
                System.out.println("Fizz");
            } else if (k % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(k);
            }
        }


        //For some reason this fizzBuzz2 called method is being ignored.
        fizzBuzz2(80);

    }

    public static String fizzBuzz2(int number){
        if (number % 15 == 0){
            return "fizzBuzz";
        }else if (number % 5 == 0){
            return "buzz";
        }else if (number % 3 == 0){
            return "fizz";
        }
        return String.valueOf(number);
    }


    //    public static String fizzBuzz(int number){
//        if(b)
//    }


}
