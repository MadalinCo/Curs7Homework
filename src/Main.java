import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println(getAverageGradeForAllStudents(92,10));

    }

    private static int  getAverageGradeForAllStudents(int sumOfGrades,int numberOfStudents ) {
         return sumOfGrades/numberOfStudents;
    }
}


 class Student1 {
    String name;

    public String getName() {
        return name;
    }

    int grade;

    public int getGrade() {
        return grade;
    }
    public static  int sumOfGrades( int sumOfGrades){
        return sumOfGrades;


    }

    public static int numberOfStudents(int numberOfStudents){
        return numberOfStudents;
    }
}