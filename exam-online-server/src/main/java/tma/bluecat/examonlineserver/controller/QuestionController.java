package tma.bluecat.examonlineserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tma.bluecat.examonlineserver.entity.Question;
import tma.bluecat.examonlineserver.service.QuestionService;

import java.util.List;

@RestController
@RequestMapping("api/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/find-by-subject/{id}")
    public List<Question> getQuestionBySubjectId(@PathVariable("id") Long id){
        return questionService.getQuestionBySubjectId(id);
    }

    @PostMapping("/")
    public Question addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }
}
