package za.ac.cput.factory;

import za.ac.cput.domain.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentFactoryTest {
    @Test
    void testCreateStudent() {
        Student student = StudentFactory.createStudent("S001", "John Doe", "john@example.com");
        assertNotNull(student);
        assertEquals("S001", student.getId());
        assertEquals("John Doe", student.getName());
    }
}