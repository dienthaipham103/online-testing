package tma.bluecat.examonlineserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tma.bluecat.examonlineserver.entity.Exam;

import java.util.List;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {

    @Query("SELECT e FROM Exam e where e.subjectid.id = :id")
    List<Exam> getExamBySubjectId(@Param("id") Long id);
}
