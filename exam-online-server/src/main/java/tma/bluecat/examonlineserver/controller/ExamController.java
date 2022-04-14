package tma.bluecat.examonlineserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tma.bluecat.examonlineserver.entity.Exam;
import tma.bluecat.examonlineserver.service.ExamService;

import java.util.List;

@RestController
@RequestMapping("api/exam")
public class ExamController {

    @Autowired
    private ExamService examService;

    @GetMapping("/find-by-subject/{id}")
    public List<Exam> getExamBySubjectId(@PathVariable("id") Long id){
        return examService.getExamBySubjectId(id);
    }

    @PostMapping("/")
    public Exam addExam(@RequestBody Exam exam){
        return examService.addExam(exam);
    }
}
