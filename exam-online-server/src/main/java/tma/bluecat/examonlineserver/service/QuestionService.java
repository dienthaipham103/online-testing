package tma.bluecat.examonlineserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tma.bluecat.examonlineserver.entity.Question;
import tma.bluecat.examonlineserver.repository.QuestionRepository;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    public List<Question> getQuestionBySubjectId(Long id){
        return questionRepository.getQuestionBySubjectId(id);
    }

    public Question addQuestion(Question question){
        return questionRepository.save(question);
    }
}
