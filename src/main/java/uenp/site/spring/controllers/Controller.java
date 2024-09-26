package uenp.site.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uenp.site.spring.domain.Student;
import uenp.site.spring.services.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public String myEndpoint() {
        return "Hello World!";
    }

    @GetMapping("/student")
    public List<Student> getStudent() {
        return studentService.getStudent();
    }
    
    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
}
