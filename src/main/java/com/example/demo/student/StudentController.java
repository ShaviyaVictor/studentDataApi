package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")

/*This will have all the resources for our API*/
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }

    // Get method
    @GetMapping
    public List<Student> getStudents() {

        return studentService.getStudents();
    }

    // Post method
    @PostMapping
    public void  registerNewStudent(@RequestBody Student student) {

        studentService.addNewStudent(student);
    }

    // Delete method
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {

        studentService.deleteStudent(studentId);
    }

    // Put method
    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email
    ) {
        studentService.updateStudent(studentId, name, email);
    }

}
