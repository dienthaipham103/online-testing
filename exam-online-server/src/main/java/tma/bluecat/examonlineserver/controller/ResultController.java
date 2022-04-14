package tma.bluecat.examonlineserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tma.bluecat.examonlineserver.entity.Result;
import tma.bluecat.examonlineserver.service.ResultService;

import java.util.List;

@RestController
@RequestMapping("api/result")
public class ResultController {

    @Autowired
    private ResultService resultService;

    @GetMapping("/find-by-exam/{id}")
    public List<Result> getResultByExamId(@PathVariable("id") Long id){
        return resultService.getResultByExamId(id);
    }

    @GetMapping("/find-by-student/{id}")
    public List<Result> getResultByStudentId(@PathVariable("id") Long id){
        return resultService.getResultByStudentId(id);
    }

    @GetMapping("/find-by-exam-and-student/{eid}&{sid}")
    public List<Result> getResultByExamAndStudent(@PathVariable("eid") Long eid, @PathVariable("sid") Long sid){
        return resultService.getResultByExamAndStudent(eid, sid);
    }

    @PostMapping("/")
    public Result addResult(@RequestBody Result result){
        return resultService.addResult(result);
    }
}
