import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    HashMap<Integer, Student> studentHashMap = new HashMap<>();

    public static void main(String[] args) {

        Course course = new Course(2,"SE");

        StudentManagement studentManagement;
       studentManagement = new StudentManagement();

       studentManagement.addStudent(1,"Lahiru");
        studentManagement.addStudent(2,"Prasad");

       studentManagement.enrollToCourse(1, new Course(1,"IT"));
        studentManagement.enrollToCourse(1, course);

        studentManagement.enrollToCourse(2, new Course(3,"CNE"));

        studentManagement.unEnrollToCourse(1, course);
        studentManagement.removeStudent(1);

       studentManagement.displayAllStudents();




    }

}