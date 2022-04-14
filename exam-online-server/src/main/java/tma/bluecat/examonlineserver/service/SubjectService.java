package tma.bluecat.examonlineserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tma.bluecat.examonlineserver.entity.Subject;
import tma.bluecat.examonlineserver.repository.SubjectRepository;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> getAllSubject(){
        return subjectRepository.findAll();
    }

    public Subject addSubject(Subject subject){
        return subjectRepository.save(subject);
    }
}
