package tma.bluecat.examonlineserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tma.bluecat.examonlineserver.entity.Student;
import tma.bluecat.examonlineserver.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }
}
