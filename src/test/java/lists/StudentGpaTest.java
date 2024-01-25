package lists;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class StudentGpaTest {
        @Test
        public void testRemoveGPA() {
            ArrayList<StudentGpa> studentList = new ArrayList<>();
            studentList.add(new StudentGpa("John", "Doe", 3.5));
            studentList.add(new StudentGpa("Jane", "Smith", 2.8));
            studentList.add(new StudentGpa("Alice", "Johnson", 3.2));
            studentList.add(new StudentGpa("Bob", "Williams", 2.9));
            ArrayList<StudentGpa> result = StudentGpa.removeGPA(studentList);
            for (StudentGpa student : result) {
                assertTrue(student.gpa >= 3.1);
            }
        }
        @Test
        public void testRemoveGPAEmptyList() {
            ArrayList<StudentGpa> emptyList = new ArrayList<>();
            ArrayList<StudentGpa> result = StudentGpa.removeGPA(emptyList);
            assertTrue(result.isEmpty());
        }
    }
