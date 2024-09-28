package uenp.site.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uenp.site.spring.domain.Student;
import uenp.site.spring.exception.ResourceNotFoundException;
import uenp.site.spring.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

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

    public Student getStudentById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isEmpty()) {
            throw new ResourceNotFoundException("Student not found");
        }
        return student.get();
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Long id, Student student) {
        Student studentToUpdate = studentRepository.findById(id).get();
        studentToUpdate.setName(student.getName());
        studentToUpdate.setAge(student.getAge());
        studentToUpdate.setCourse(student.getCourse());
        return studentRepository.save(studentToUpdate);
    }
}
