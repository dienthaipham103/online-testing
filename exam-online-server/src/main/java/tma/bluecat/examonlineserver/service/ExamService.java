package tma.bluecat.examonlineserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tma.bluecat.examonlineserver.entity.Exam;
import tma.bluecat.examonlineserver.repository.ExamRepository;

import java.util.List;

@Service
public class ExamService {

    @Autowired
    private ExamRepository examRepository;

    public List<Exam> getExamBySubjectId(Long id){
        return examRepository.getExamBySubjectId(id);
    }

    public Exam addExam(Exam exam){
        return examRepository.save(exam);
    }
}
