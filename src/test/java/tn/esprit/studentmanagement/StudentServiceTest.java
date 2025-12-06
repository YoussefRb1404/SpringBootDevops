package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import tn.esprit.studentmanagement.services.StudentService;
import tn.esprit.studentmanagement.entities.Student;

public class StudentServiceTest {

    @Test
    void testAddStudent() {
        StudentService service = new StudentService();

        Student s = new Student();
        s.setFirstName("Youssef");
        s.setLastName("Rebai");

        // cette méthode existe dans ton service ?
        // sinon on fera un vrai test mocké
        Student saved = service.saveStudent(s);

        assertNotNull(saved);
    }
}
