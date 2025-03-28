package za.ac.cput.service;


import za.ac.cput.domain.Student;
import za.ac.cput.repository.StudentRepository;

import java.util.Set;

public class StudentService {
    private StudentRepository studentRepository = new StudentRepository();

    public Student addStudent(Student student) {
        return studentRepository.create(student);
    }

    public Student getStudentById(String id) {
        return studentRepository.read(id);
    }

    public Set<Student> getAllStudents() {
        return studentRepository.getAll();
    }
}

////Used StudentService for real integration
//import za.ac.cput.domain.Student;
//import za.ac.cput.factory.StudentFactory;
//import za.ac.cput.repository.StudentRepository;
//
//public class StudentService {
//    private StudentRepository studentRepository = new StudentRepository();
//
//    public void testCreateStudent() {
//        Student student = StudentFactory.createStudent("1", "John Doe", "john@example.com");
//        System.out.println(student);
//        studentRepository.create(student); // Save student
//    }
//}



