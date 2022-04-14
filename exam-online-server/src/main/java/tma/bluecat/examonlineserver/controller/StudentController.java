package tma.bluecat.examonlineserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tma.bluecat.examonlineserver.entity.Student;
import tma.bluecat.examonlineserver.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") Long id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/")
    public List<Student> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return getAllStudent();
    }
}
