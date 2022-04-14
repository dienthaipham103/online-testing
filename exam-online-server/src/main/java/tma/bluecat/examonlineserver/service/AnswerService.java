package tma.bluecat.examonlineserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tma.bluecat.examonlineserver.entity.Answer;
import tma.bluecat.examonlineserver.repository.AnswerRepository;

import java.util.List;

@Service
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    public List<Answer> getAnswerByQuestionId(Long id){
        return answerRepository.findAnswerByQuestionId(id);
    }

    public Answer addAnswer(Answer answer){
        return answerRepository.save(answer);
    }
}
