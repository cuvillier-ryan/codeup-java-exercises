package grades;

import util.Input;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();

        Student ryan = new Student("ryanBeAwesome");
        ryan.addGrade(100);
        ryan.addGrade(95);
        ryan.addGrade(90);

        Student bill = new Student("billMurray");
        bill.addGrade(100);
        bill.addGrade(95);
        bill.addGrade(90);

        Student robert = new Student("robertGlasper");
        robert.addGrade(100);
        robert.addGrade(95);
        robert.addGrade(90);

        Student dave = new Student("daveChapelle");
        dave.addGrade(100);
        dave.addGrade(95);
        dave.addGrade(90);



        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!\n");
        System.out.println("%s");








//        System.out.println(students);
//        System.out.println(students.get("ryan"));

    }

    // Create 4 students and add some grades for each
}
