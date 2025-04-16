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
    //method for returning the map
    public HashMap<String , Object> getStudentMap(){
        return studentMap;
    }



}
