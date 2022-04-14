package tma.bluecat.examonlineserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tma.bluecat.examonlineserver.entity.Result;
import tma.bluecat.examonlineserver.repository.ResultRepository;

import java.util.List;

@Service
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;

    public List<Result> getResultByExamId(Long id){
        return resultRepository.getResultByExamId(id);
    }

    public List<Result> getResultByStudentId(Long id){
        return resultRepository.getResultByStudentId(id);
    }

    public List<Result> getResultByExamAndStudent(Long eid, Long sid){
        return resultRepository.getResultByExamAndStudent(eid, sid);
    }

    public Result addResult(Result result){
        return resultRepository.save(result);
    }
}
