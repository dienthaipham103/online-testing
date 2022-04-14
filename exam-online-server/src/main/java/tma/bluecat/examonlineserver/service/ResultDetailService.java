package tma.bluecat.examonlineserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tma.bluecat.examonlineserver.entity.ResultDetail;
import tma.bluecat.examonlineserver.repository.ResultDetailRepository;

import java.util.List;

@Service
public class ResultDetailService {

    @Autowired
    private ResultDetailRepository resultDetailRepository;

    public List<ResultDetail> getResultDetailByResultId(Long id){
        return resultDetailRepository.getResultDetailByResultId(id);
    }
}
