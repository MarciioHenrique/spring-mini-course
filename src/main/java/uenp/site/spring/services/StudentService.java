package uenp.site.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uenp.site.spring.domain.Student;
import uenp.site.spring.repositories.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudent() {
        Student student = new Student();
        student.setName("MH");
        student.setAge(21);
        student.setCourse("Computer Science");

        return studentRepository.findAll();
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
