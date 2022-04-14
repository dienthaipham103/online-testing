package tma.bluecat.examonlineserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tma.bluecat.examonlineserver.entity.ResultDetail;

import java.util.List;

@Repository
public interface ResultDetailRepository extends JpaRepository<ResultDetail, Long> {

    @Query("SELECT rs FROM ResultDetail rd WHERE rd.resultid.id = :id")
    List<ResultDetail> getResultDetailByResultId(@Param("id") Long id);
}
