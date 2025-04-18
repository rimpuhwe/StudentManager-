import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;


public class StudentManager{
    private final HashMap<String , Object> studentMap;
    // building constructor
    StudentManager(){
        this.studentMap = new HashMap<>();
    }

    /**
     * Adding the name, id,course of students to a unique  object
     * @param name
     * @param id
     * @param course
     */
    public void addStudent(String name , int id , String course) throws StudentException {
        if (name == null || name.isEmpty()){
            throw new StudentException("Name cannot be empty or null");
        }
        if(id < 0){
            throw new StudentException("ID cannot be less than 0");
        }
        studentMap.put("name", name);
        studentMap.put("id", id);
        studentMap.put("course", course);
    }

    /**
     * this method return the object with name , id , course keys with their values
     * @return {"name":value , "id": value , "course" : value}
     */
    public HashMap<String , Object> getStudentMap(){
        return studentMap;
    }
    // method for sorting by id
    public static void sortStudents(ArrayList<StudentManager> students){
        try{
            //using comparator for comparing ids in studentMap object
            students.sort(Comparator.comparingInt(student -> (int) student.getStudentMap().get("id")));
            System.out.println("Sorted students by id in ascending order: " + students);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    // method for searching by id
    public static void searchStudents(ArrayList<StudentManager> students, int id){
        try{
            Object student = students.stream()
                    .map(StudentManager::getStudentMap)
                    .filter(map -> map.get("id").equals(id))
                    .findFirst()
                    //when nothing found
                    .orElse(null);

            if (student != null) {
                System.out.println("the student with id " + id + " is " + student);
            } else {
                System.out.println("the student with id " + id + " is not found");
            }
        }
        catch(Exception e){
            //running into system.err.println for consoling the error messages
            System.err.println("Error searching a student: " + e.getMessage());
        }
    }
    public static void removeStudent(ArrayList<StudentManager> students, int id){
        try{
            boolean removed = students.removeIf(student -> {
                Object studentId = student.getStudentMap().get("id");
                return studentId != null && studentId.equals(id);
            });
            if (removed) {
                System.out.println("the student with id " + id + " is removed");
            } else {
                System.out.println("the student with id " + id + " is not found");
            }
        }
        catch(Exception e){
            System.err.println("Error while removing student: " + e.getMessage());
        }

    }


    @Override
    public String toString() {
        return studentMap.toString();
    }
}
