import java.util.ArrayList;

import java.util.Comparator;
import java.util.HashMap;

public class StudentManager{
    private final HashMap<String , Object> studentMap;
    // building constructor
    StudentManager(){
        this.studentMap = new HashMap<>();
    }

    // method for adding the student
    public void addStudent(String name , int id , String course) {
        studentMap.put("name", name);
        studentMap.put("id", id);
        studentMap.put("course", course);
    }
    //method for returning the map for testing
    public HashMap<String , Object> getStudentMap(){
        return studentMap;
    }
    // method for sorting by id
    public static void sortStudents(ArrayList<StudentManager> students){
        //using comparator for comparing ids in studentMap object
        students.sort(Comparator.comparingInt(student -> (int) student.getStudentMap().get("id")));
        System.out.println("Sorted students by id in ascending order: "+ students);


    }

    @Override
    public String toString() {
        return studentMap.toString();
    }
}
