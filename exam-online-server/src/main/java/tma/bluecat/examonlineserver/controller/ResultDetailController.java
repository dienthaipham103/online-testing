package tma.bluecat.examonlineserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tma.bluecat.examonlineserver.entity.ResultDetail;
import tma.bluecat.examonlineserver.service.ResultDetailService;

import java.util.List;

@RestController
@RequestMapping("api/result-detail")
public class ResultDetailController {

    @Autowired
    private ResultDetailService resultDetailService;

    @GetMapping("/find-by-result/{id}")
    public List<ResultDetail> getResultDetailByResultId(@PathVariable("id") Long id){
        return resultDetailService.getResultDetailByResultId(id);
    }
}
