package tma.bluecat.examonlineserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tma.bluecat.examonlineserver.entity.Subject;
import tma.bluecat.examonlineserver.service.SubjectService;

import java.util.List;

@RestController
@RequestMapping("api/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/")
    public List<Subject> getAllSubject(){
        return subjectService.getAllSubject();
    }

    @PostMapping("/")
    public List<Subject> addSubject(@RequestBody Subject subject){
        subjectService.addSubject(subject);
        return getAllSubject();
    }
}
