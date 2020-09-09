package grades;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        Student ryan = new Student("ryan");
        ryan.addGrade(100);
        ryan.addGrade(98);
        ryan.addGrade(95);
        ryan.addGrade(90);
//        System.out.println(ryan.getName() + " " + ryan.getGradeAverage());

    }

}

