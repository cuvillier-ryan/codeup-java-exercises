import java.util.Date;
import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(add(1, 6));
        System.out.println(subtract(8, 6));
        System.out.println(multiply(7, 5));
        System.out.println(divide(10, 5));
        System.out.println(modulus(8, 3));
        System.out.println(Multiply(5, 5));
    }

    // Addition method
    public static int add(int x, int y) {
        return x + y;
    }

    //Subtraction method
    public static int subtract(int x, int y) {
        return x - y;
    }

    //Multiplication method
    public static int multiply(int x, int y) {
        return x * y;
    }

    //Division method
    public static int divide(int x, int y) {
        return x / y;
    }

    //Modulus method
    public static int modulus(int x, int y) {
        return x % y;
    }

    public static int Multiply(int x, int y) {
        int result = 0;
        while (x > 0) {
            result += y;
            x--;
        }
        return result;
    }





}
