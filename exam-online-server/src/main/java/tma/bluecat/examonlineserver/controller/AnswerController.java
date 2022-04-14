package tma.bluecat.examonlineserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tma.bluecat.examonlineserver.entity.Answer;
import tma.bluecat.examonlineserver.service.AnswerService;

import java.util.List;

@RestController
@RequestMapping("api/answer")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @GetMapping("/find-by-question/{id}")
    public List<Answer> getAnswerByQuestionId(@PathVariable("id") Long id){
        return answerService.getAnswerByQuestionId(id);
    }

    @PostMapping("/")
    public Answer addAnswer(@RequestBody Answer answer){
        return answerService.addAnswer(answer);
    }
}
