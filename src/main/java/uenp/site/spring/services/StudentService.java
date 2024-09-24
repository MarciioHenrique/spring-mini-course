package uenp.site.spring.services;

import org.springframework.stereotype.Service;
import uenp.site.spring.domain.Student;

@Service
public class StudentService {
    public Student getStudent() {
        Student student = new Student();
        student.setName("MH");
        student.setAge(21);
        student.setCourse("Computer Science");
        return student;
    }
}
