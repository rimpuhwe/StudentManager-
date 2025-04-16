import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StudentManager student1 = new StudentManager();
        student1.addStudent("Anne" , 123 , "java");
        StudentManager student2 = new StudentManager();
        student2.addStudent("Carine" , 122 , "Python");

        System.out.println(student1.getStudentMap());
        System.out.println(student2.getStudentMap());


    }
}
