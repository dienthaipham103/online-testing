package tma.bluecat.examonlineserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/")
    public List<Class> addClass(@RequestBody Class clas){
        classService.addClass(clas);
        return getAllClass();
    }
}
