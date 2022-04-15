package tma.bluecat.examonlineserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tma.bluecat.examonlineserver.entity.Class;
import tma.bluecat.examonlineserver.service.ClassService;

import java.util.List;

@RestController
@RequestMapping("api/class")
public class ClassController {

    @Autowired
    private ClassService classService;

    @GetMapping("/")
    public List<Class> getAllClass() {
        return classService.getAllClass();
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Class>> getClassResponse() {
        try {
            List<Class> classes = classService.getAllClass();
            if(classes.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            return new ResponseEntity<>(classes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/")
    public List<Class> addClass(@RequestBody Class clas){
        classService.addClass(clas);
        return getAllClass();
    }
}
