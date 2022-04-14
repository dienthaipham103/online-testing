package tma.bluecat.examonlineserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tma.bluecat.examonlineserver.entity.Answer;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
    @Query("SELECT a FROM Answer a WHERE a.questionid.id=:id")
    List<Answer> findAnswerByQuestionId(@Param("id") Long id);
}
