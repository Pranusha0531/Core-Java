package lists;
import java.util.ArrayList;
import java.util.Iterator;
public class StudentGpa {
        String firstName;
        String lastName;
        public double gpa;
        public StudentGpa(String firstName, String lastName, double gpa) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gpa = gpa;
        }
        public static ArrayList<StudentGpa> removeGPA(ArrayList<StudentGpa> studentList) {
            double total = 0;
            for (StudentGpa student : studentList) {
                total += student.gpa;
            }
            double averageGPA = total / studentList.size();
            Iterator<StudentGpa> iterator = studentList.iterator();
            while (iterator.hasNext()) {
                StudentGpa student = iterator.next();
                if (student.gpa < averageGPA) {
                    iterator.remove();
                }
            }
            System.out.println(studentList);
            return studentList;
        }
    }

