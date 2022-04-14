package tma.bluecat.examonlineserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tma.bluecat.examonlineserver.entity.Result;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {

    @Query("SELECT r FROM Result r WHERE r.examid.id=:id")
    List<Result> getResultByExamId(@Param("id") Long id);

    @Query("SELECT r FROM Result r WHERE r.studentid.id=:id")
    List<Result> getResultByStudentId(@Param("id") Long id);

    @Query("SELECT r FROM Result r WHERE r.examid.id = :eid AND r.studentid.id = :sid")
    List<Result> getResultByExamAndStudent(@Param("eid") Long eid, @Param("sid") Long sid);
}
