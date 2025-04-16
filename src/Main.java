import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentManager student1 = new StudentManager();
        student1.addStudent("Anne" , 123 , "java");
        StudentManager student2 = new StudentManager();
        student2.addStudent("Carine" , 122 , "Python");
        ArrayList<StudentManager> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
        StudentManager.sortStudents(students);


//        System.out.println(student1.getStudentMap());
//        System.out.println(student2.getStudentMap());


    }
}
