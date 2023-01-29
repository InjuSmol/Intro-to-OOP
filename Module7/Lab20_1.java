// Smolianova Varvara 115284311
import java.util.ArrayList;
import java.util.Arrays;
public class Lab20_1 {
    public static void main (String [] args){
        Course course = new Course("CSE 114");
        course.addStudent("Tom Smith");
        course.addStudent("Dick Smith");
        course.addStudent("Harry Smith");
        String[] students = course.getStudents();
        System.out.print("Before: ");
        for(int i = 0; i < course.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");
        course.dropStudent("Harry Smith");
        System.out.print("After: ");
        String[]students1 = course.getStudents();
        for(int i = 0; i < course.getNumberOfStudents(); i++)
            System.out.print(students1[i] + ", ");
    }
}
class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }
    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] arr = new String[students.length + 100];
            for (int i = 0; i < students.length; i++) {
                arr[i] = students[i];
                students = arr;
            }
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudents() {
        String[] arrS = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {

            arrS[i] = students[i];
        }
        return arrS;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String getCourseName() {
        return courseName;
    }
    public void dropStudent(String student) {

        for (int i = 0; i < students.length; i++) {

            if (student.equals(students[i])) {
                for (int j=i; j < numberOfStudents;j++) {
                    students[j] = students[j+1];
                }
                students[numberOfStudents-1] ="-";
                numberOfStudents--;
                break;
            }
        }
    }
    public void clear(){
        students = new String[100];
        numberOfStudents = 0;
    }
}


