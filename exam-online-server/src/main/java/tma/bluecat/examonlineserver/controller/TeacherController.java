package tma.bluecat.examonlineserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tma.bluecat.examonlineserver.entity.Teacher;
import tma.bluecat.examonlineserver.service.TeacherService;

import java.util.List;

@RestController
@RequestMapping("api/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/")
    public List<Teacher> getAllTeacher(){
        return teacherService.getAllTeacher();
    }

    @PostMapping("/")
    public List<Teacher> addTeacher(@RequestBody Teacher teacher){
        teacherService.addTeacher(teacher);
        return getAllTeacher();
    }
}
