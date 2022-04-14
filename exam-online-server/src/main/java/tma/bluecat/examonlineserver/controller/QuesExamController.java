package tma.bluecat.examonlineserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tma.bluecat.examonlineserver.entity.QuesExam;
import tma.bluecat.examonlineserver.service.QuesExamService;

import java.util.List;

@RestController
@RequestMapping("api/ques_exam")
public class QuesExamController {

    @Autowired
    private QuesExamService quesExamService;

    @GetMapping("/find-by-exam/{id}")
    public List<QuesExam> getQuesExamByExamId(@PathVariable("id") Long id){
        return quesExamService.getQuesExamByExamId(id);
    }
}
