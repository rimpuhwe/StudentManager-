import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException, StudentException {
        StudentManager student1 = new StudentManager();
        student1.addStudent("Anne" , 300 , "java");
        StudentManager student2 = new StudentManager();
        student2.addStudent("Carine" , 122 , "Python");
        ArrayList<StudentManager> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        System.out.println(student1);
        System.out.println("*********************************************************************************");
        System.out.print("HERE IS THE LIST OF STUDENTS : "+ students +"\n");
        System.out.println("*********************************************************************************");
        Thread.sleep(3000);
        StudentManager.sortStudents(students);
        StudentManager.searchStudents(students , 120);
        StudentManager.removeStudent(students , 122);
        System.out.println(students);



//        System.out.println(student1.getStudentMap());
//        System.out.println(student2.getStudentMap());


    }
}
