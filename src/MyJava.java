import java.util.ArrayList;
import java.util.List;

public class MyJava {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(factorial(6));
        System.out.println(quotient(6, 12));
//        System.out.println(minMaxSum(new int[]{2, 4, 5, 6, 7}));
    }

    public static int factorial(int n) {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }

    public static double quotient(double divisor, double dividend) {
        double quotient = dividend / divisor;
        double remainder = dividend % divisor;
        return quotient + remainder;
    }

//    public static double minMaxSum(int[] numbers) {
//        int largest = Integer.MIN_VALUE;
//        int smallest = Integer.MAX_VALUE;
//        for (int number : numbers) {
//
//        }
//    }

//        MyJava secondMyJava = new MyJava();
//        secondMyJava.singHappyBirthday("Ryan");

//Final is to set a variable to const.
//        final float pi = 3.14F;
//        System.out.println(pi);


// Going to be practicing 2D and 3D arrays.
//        int[][] numbers = {{1,2,3}, {4,5,6}};
//        System.out.println(Arrays.deepToString(numbers));


//        int[] numbers = {2, 3, 5, 1, 4};
//        Arrays.sort(numbers);
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));
//        String[] practice = new String[5];
//        practice[2] = "Santa Clause";
//        System.out.println(Arrays.toString(practice));
//
//        int[] anotherPractice = {3, 6, 7, 9, 5};
//        Arrays.sort(anotherPractice);
//        System.out.println(Arrays.toString(anotherPractice));
//
//        String[] names = {"Xavier", "Ryan", "Bobby", "Rita"};
//        Arrays.sort(names);
//        System.out.println(Arrays.toString(names));
//
//

    }