package uenp.site.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uenp.site.spring.domain.Student;
import uenp.site.spring.services.StudentService;

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
    public Student getStudent() {
        return studentService.getStudent();
    }
}
