package tma.bluecat.examonlineserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tma.bluecat.examonlineserver.entity.QuesExam;

import java.util.List;

@Repository
public interface QuesExamRepository extends JpaRepository<QuesExam, Long> {

    @Query("SELECT q FROM QuesExam q WHERE q.examid.id = :id")
    List<QuesExam> getQuesExamByExamId(@Param("id") Long id);
}
