import java.util.ArrayList;

public class Lab20_2 {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");
        System.out.println("Number of students in course1: " +
                course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for(int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");
        System.out.println();
        System.out.println("Number of students in course2: " +
                course2.getNumberOfStudents());
        students = course2.getStudents();
        for(int i = 0; i < course2.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");
    }
}
class Course2 {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;

    public Course2(String courseName) {
        this.courseName = courseName;
    }
    public void addStudent(String student) {

        students.add(student);
    }
    public String[] getStudents() {
       String[]arr =  students.toArray(new String[students.size()]);
        return arr;
    }
    public int getNumberOfStudents() {
        return students.size();
    }
    public String getCourseName() {
        return courseName;
    }
    public void dropStudent(String student) {

        students.remove(student);
    }
    public void clear(){
        students.clear();
    }
}

