package tma.bluecat.examonlineserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tma.bluecat.examonlineserver.entity.Teacher;
import tma.bluecat.examonlineserver.repository.TeacherRepository;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeacher(){
        return teacherRepository.findAll();
    }

    public Teacher addTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }
}
