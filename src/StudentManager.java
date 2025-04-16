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
    // method for searching by id
    public static void searchStudents(ArrayList<StudentManager> students, int id){
        Object student =  students.stream()
                .map(StudentManager::getStudentMap)
                .filter(map ->  map.get("id").equals(id))
                .findFirst()
                //when nothing found
                .orElse(null);

        if(student != null){
            System.out.println("the student with id " + id + " is " + student);
        }
        else{
            System.out.println("the student with id " + id + " is not found");
        }
    }
    public static void removeStudent(ArrayList<StudentManager> students, int id){
       boolean removed = students.removeIf(student -> {
           Object studentId = student.getStudentMap().get("id");
           return studentId != null && studentId.equals(id);
       });
       if(removed){
           System.out.println("the student with id " + id + " is removed");
       }
       else{
           System.out.println("the student with id " + id + " is not found");
       }

    }


    @Override
    public String toString() {
        return studentMap.toString();
    }
}
