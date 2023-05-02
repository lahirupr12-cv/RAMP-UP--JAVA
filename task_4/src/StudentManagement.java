import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class StudentManagement {
    private Map<Integer, Student> students;
    final Logger logger =  Logger.getLogger(Main.class.getName());

    public StudentManagement(){
        students = new HashMap<>();
    }

    public void addStudent(int id, String name){
        if(!students.containsKey(id)){
            students.put(id, new Student(name));
            logger.info("Student added");
        }else{
            logger.warning("Student already exists");
        }
    }

    public void removeStudent(int id){
        if(students.containsKey(id)){
            students.remove(id);
            logger.info("Student removed");
        }else{
            logger.warning("Student doesn't exists");
        }
    }

    public void enrollToCourse(int id, Course course){
        if(students.containsKey(id)){
            Student student = students.get(id);
            student.enrollCourse(course);
            logger.info("Enrolled to course");
        }else {
            logger.warning("Student doesn't exists");
        }
    }

    public void unEnrollToCourse(int id, Course course){
        if(students.containsKey(id)){
            Student student = students.get(id);
            student.unEnrollCourse(course);
            logger.info("Un Enrolled to course");
        }else {
            logger.warning("Student doesn't exists");
        }
    }

    public void displayAllStudents(){
        for(Map.Entry<Integer, Student> student : students.entrySet()){
            System.out.println("Student id : "+ student.getKey());
            System.out.println("Student name is : "+student.getValue().getName());
            System.out.println("Courses : ");
            for(Course course : student.getValue().getCourses()){
//                logger.info(course.getId());
                System.out.print(course.getName()+" , ");
            }
            System.out.println();

        }
    }
}
