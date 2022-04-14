package tma.bluecat.examonlineserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tma.bluecat.examonlineserver.entity.Class;
import tma.bluecat.examonlineserver.repository.ClassRepository;

import java.util.List;

@Service
public class ClassService {

    @Autowired
    private ClassRepository classRepository;

    public List<Class> getAllClass(){
        return classRepository.findAll();
    }

    public Class getClassById(Long id){
        return classRepository.findById(id).get();
    }

    public Class addClass(Class clas){
        return classRepository.save(clas);
    }
}
