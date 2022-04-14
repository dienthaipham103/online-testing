package tma.bluecat.examonlineserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tma.bluecat.examonlineserver.entity.QuesExam;
import tma.bluecat.examonlineserver.repository.QuesExamRepository;

import java.util.List;

@Service
public class QuesExamService {

    @Autowired
    private QuesExamRepository quesExamRepository;

    public List<QuesExam> getQuesExamByExamId(Long id){
        return quesExamRepository.getQuesExamByExamId(id);
    }

    public QuesExam addQuesExam(QuesExam quesExam){
        return quesExamRepository.save(quesExam);
    }
}
